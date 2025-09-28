package ivlev.ivlevback.service;

import ivlev.ivlevback._1c.commerceml_205.*;
import ivlev.ivlevback._1c.exchangewithsites.SiteExchange;
import ivlev.ivlevback._1c.exchangewithsites.SiteExchangePortType;
import ivlev.ivlevback.dto.ChangeOrderAdmin;
import ivlev.ivlevback.models.AdminRequest;
import ivlev.ivlevback.models.Box;
import ivlev.ivlevback.models.Orders;
import ivlev.ivlevback.models.Person;
import ivlev.ivlevback.repositories.BoxesRepository;
import ivlev.ivlevback.repositories.OrdersRepository;
import ivlev.ivlevback.security.PersonDetails;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.handler.MessageContext;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class OrdersService {
    private final OrdersRepository ordersRepository;
    private final BoxesRepository boxesRepository;
    private final ModelMapper modelMapper;
    private final PersonService personService;

    @Value("${auth_1c}")
    private String authToken1c;


    public OrdersService(OrdersRepository ordersRepository, BoxesRepository boxesRepository, ModelMapper modelMapper,
                         PersonService personService) {
        this.ordersRepository = ordersRepository;
        this.boxesRepository = boxesRepository;
        this.modelMapper = modelMapper;
        this.personService = personService;
    }

    @Transactional
    public Orders save(PersonDetails personDetails, Orders order, List<Box> boxList) {
        if (order.getId() != 0) {
            order = updateExistingOrder(personDetails, order);
        } else {
            order = createNewOrder(personDetails, order);
        }

        saveBoxesBatch(order, boxList);
        return order;
    }

    public List<Orders> getAll(PersonDetails personDetails) {
        return ordersRepository.findByPersonAndStatusOrderByDepartureDateDesc(personDetails.getPerson(), "Доставлен");
    }

    public List<Orders> getAllCurrentOrders(PersonDetails personDetails) {
        return ordersRepository.findByPersonAndStatusIsNotOrderByDepartureDateDesc(personDetails.getPerson(), "Доставлен");
    }

    public List<Orders> findForAdmin(AdminRequest adminRequest) {
        if (adminRequest.getSortBy().equals("")) {
            return ordersRepository.findForAdmin(adminRequest.getDepartureCity(),
                    adminRequest.getStore(), adminRequest.getSendCity(), adminRequest.getPhoneNumber(),
                    adminRequest.getEntity(), adminRequest.getStatus(),
                    adminRequest.getStartDepartureDate(), adminRequest.getEndDepartureDate(),
                    adminRequest.getStartOrderDate(), adminRequest.getEndOrderDate(), adminRequest.getAcceptanceDate());
        } else
            return ordersRepository.findForAdminAndSort(adminRequest.getDepartureCity(),
                    adminRequest.getStore(), adminRequest.getSendCity(), adminRequest.getPhoneNumber(), adminRequest.getStatus(),
                    adminRequest.getStartDepartureDate(), adminRequest.getEndDepartureDate(),
                    adminRequest.getStartOrderDate(), adminRequest.getEndOrderDate(), adminRequest.getAcceptanceDate(),
                    Sort.by(adminRequest.getSortBy()));
    }

    public void changeAdmin(ChangeOrderAdmin adminRequest) {
        List<Orders> orders = adminRequest.getOrders();
        for (Orders order : orders) {
            Orders foundOrder = ordersRepository.findById(order.getId()).get();
            if (!(adminRequest.getStatus().equals("")))
                foundOrder.setStatus(adminRequest.getStatus());
            if (!(adminRequest.getChangeable().equals("")))
                foundOrder.setChangeable(adminRequest.getChangeable().equals("yes"));
            if (!(adminRequest.getPaymentStatus().equals("")))
                foundOrder.setPaymentStatus(adminRequest.getPaymentStatus().equals("yes"));
            if (!(adminRequest.getPaymentSite().equals("")))
                foundOrder.setPaymentSite(adminRequest.getPaymentSite().equals("yes"));
            ordersRepository.save(foundOrder);
        }
    }

    @Transactional
    public void delete(Orders order) {
        boxesRepository.deleteAllByOrderId(order.getId());
        ordersRepository.deleteById(order.getId());
    }

    public void changeStatusAfterPayment(String id, String sum) {
        Orders order = ordersRepository.findById(Integer.valueOf(id)).get();
        if (order.getPrice().equals(sum)) {
            order.setStatus("Ожидает на ФФ");
            order.setPaymentStatus(true);
            order.setChangeable(false);
            ordersRepository.save(order);

//            changeStatus1c(order);
        }
    }

    private Orders updateExistingOrder(PersonDetails personDetails, Orders order) {
        Orders existingOrder = ordersRepository.findById(order.getId())
                .orElseThrow(() -> new EntityNotFoundException("Order not found"));

        modelMapper.map(order, existingOrder);
        existingOrder.setPerson(personDetails.getPerson());

        if (existingOrder.getEntity() != null) {
            parseAndSetCompanyInfo(existingOrder);
        } else {
            existingOrder.setEntity(order.getEntity());
        }

        if (order.getSendCity().equals("Преображенка") || order.getSendCity().equals("Чапаевск")
                || order.getSendCity().equals("Новосемейкино")) {
            order.setAcceptanceDate(order.getDepartureDate());
        }

        boxesRepository.deleteAllByOrderId(existingOrder.getId());
        return ordersRepository.save(existingOrder);
    }

    private Orders createNewOrder(PersonDetails personDetails, Orders order) {
        Person person = personDetails.getPerson();
        order.setOrderDate(LocalDate.now());
        order.setStatus(order.isPaymentSite() ? "Ожидает оплаты" : "Ожидает на ФФ");
        order.setPaymentStatus(false);
        order.setChangeable(true);
        order.setPerson(person);

        if (order.getSendCity().equals("Преображенка") || order.getSendCity().equals("Чапаевск")
                || order.getSendCity().equals("Новосемейкино")) {
            order.setAcceptanceDate(order.getDepartureDate());
        }

        parseAndSetCompanyInfo(order);

        if (!person.isAgreeToTerms()) {
            person.setAgreeToTerms(true);
            person.setAgreeToTermsDate(new java.sql.Date(System.currentTimeMillis()));
            personService.save(person);
        }
        return ordersRepository.save(order);
    }

    private void saveBoxesBatch(Orders order, List<Box> boxList) {
        boxList.forEach(box -> box.setOrder(order));
        boxesRepository.saveAll(boxList);
    }

    public void createOrdersIn1c() {
        List<Orders> notUploadedOrders = ordersRepository.findAllByStatus1cFalse();
        for (Orders orders : notUploadedOrders) {
            createOrderIn1c(orders, false);
        }
    }

    public void parseAndSetCompanyInfo(Orders order) {
        String entity = order.getEntity();
        if (entity.contains("(")) {
            int startInn = entity.indexOf("(");
            int endInn = entity.indexOf(")");
            String companyName = entity.substring(0, startInn).trim();
            String inn = entity.substring(startInn + 1, endInn).trim();

            order.setEntity(companyName);
            order.setInn(inn);
        } else {
            order.setEntity(entity);
        }
    }

    private void createOrderIn1c(Orders order, boolean isPaid) {
        try {
            SiteExchange siteExchange = new SiteExchange();
            SiteExchangePortType port = siteExchange.getSiteExchangeSoap();

            Map<String, List<String>> requestHeaders = new HashMap<>();
            requestHeaders.put("Authorization", List.of(authToken1c));

            BindingProvider bindingProvider = (BindingProvider) port;
            bindingProvider.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);

            КоммерческаяИнформация info = new КоммерческаяИнформация();
            info.setВерсияСхемы("2.05");
            info.setДатаФормирования(getTodayDateXMLGregorianCalendar());

            Документ document = new Документ();
            document.setВалюта("руб");

            document.setИд(String.valueOf(order.getId()));
            document.setНомер(String.valueOf(order.getId()));
            document.setСумма(new BigDecimal(order.getPrice()));

            document.setДата(getXMLGregorianCalendar(order.getOrderDate()));
            document.setРоль(Роль.ПРОДАВЕЦ);
            document.setКурс("1");
            document.setХозОперация(ХозОперация.ЗАКАЗ_ТОВАРА);

            Документ.Контрагенты.Контрагент agent = new Документ.Контрагенты.Контрагент();
            agent.setИд(null);
            agent.setПолноеНаименование(order.getEntity());
            agent.setРоль(Роль.ПОКУПАТЕЛЬ);

            String entity = order.getEntity();
            int startInn = entity.indexOf("(");
            int endInn = entity.indexOf(")");
            String companyName = entity.substring(0, startInn).trim(); // "ООО Ромашка"
            String inn = entity.substring(startInn + 1, endInn).trim(); // "1234567890"

            agent.setНаименование(companyName);
            agent.setИНН(inn);

            order.setEntity(companyName);
            order.setInn(inn);

            Документ.Контрагенты agents = new Документ.Контрагенты();
            List<Документ.Контрагенты.Контрагент> contragents = agents.getКонтрагент();
            contragents.add(agent);
            document.setКонтрагенты(agents);

            Документ.Товары.Товар product = new Документ.Товары.Товар();
            product.setИд(null);
//            product.setЦенаЗаЕдиницу(new BigDecimal(order.getPrice()));
            product.setКоличество(BigDecimal.valueOf(order.getVolume())
                    .setScale(4, RoundingMode.HALF_UP));
            product.setРезерв(BigDecimal.ONE);
            product.setСумма(new BigDecimal(order.getPrice()));
            product.setЕдиница("1");
            product.setКоэффициент("1");
            product.setСумма(new BigDecimal(order.getPrice()));
            product.setНаименование(String.format("Заказ в %s (%s)",
                    order.getSendCity(),
                    order.getStore()));

            Документ.Товары docProducts = new Документ.Товары();
            List<Документ.Товары.Товар> products = docProducts.getТовар();
            products.add(product);
            document.setТовары(docProducts);

            if (isPaid) {
                ЗначениеРеквизита shippingDate = new ЗначениеРеквизита();
                shippingDate.setНаименование("Дата отгрузки");
                List<String> shippingDateValues = shippingDate.getЗначение();
                shippingDateValues.add(order.getDepartureDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

                Документ.ЗначенияРеквизитов req = new Документ.ЗначенияРеквизитов();
                List<ЗначениеРеквизита> listReq = req.getЗначениеРеквизита();
                listReq.add(shippingDate);
                document.setЗначенияРеквизитов(req);
            }

            List<Документ> documents = info.getДокумент();
            documents.add(document);

            Boolean wasLoaded = port.loadOrders(info);
            System.out.println("Был загружен заказ: " + wasLoaded);
            if (wasLoaded) {
                order.setStatus1c(true);
                ordersRepository.save(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void changeStatus1c(Orders order) {
        SiteExchange siteExchange = new SiteExchange();
        SiteExchangePortType port = siteExchange.getSiteExchangeSoap();

        Map<String, List<String>> requestHeaders = new HashMap<>();
        requestHeaders.put("Authorization", List.of(authToken1c));

        BindingProvider bindingProvider = (BindingProvider) port;
        bindingProvider.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);

        КоммерческаяИнформация info = port.getOrders(getXMLGregorianCalendar(order.getOrderDate()));
        List<Документ> documents = info.getДокумент();
        for (Документ document : documents) {
            if (document.getИд().equals(String.valueOf(order.getId()))) {
                ЗначениеРеквизита shippingDate = new ЗначениеРеквизита();
                shippingDate.setНаименование("Дата отгрузки");
                List<String> shippingDateValues = shippingDate.getЗначение();
                shippingDateValues.add(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

                Документ.ЗначенияРеквизитов req = new Документ.ЗначенияРеквизитов();
                List<ЗначениеРеквизита> listReq = req.getЗначениеРеквизита();
                listReq.add(shippingDate);
                document.setЗначенияРеквизитов(req);

                Boolean wasLoaded = port.loadOrders(info);
                System.out.println("Была выполнена оплата: " + wasLoaded);
                break;
            }
        }
        createOrderIn1c(order, true);
    }

    private XMLGregorianCalendar getXMLGregorianCalendar(LocalDate date) {
        try {
            GregorianCalendar gregorianCalendar = GregorianCalendar.from(date.atStartOfDay(java.time.ZoneId.systemDefault()));
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
            return null;
        }
    }

    private XMLGregorianCalendar getTodayDateXMLGregorianCalendar() {
        LocalDate today = LocalDate.now();
        return getXMLGregorianCalendar(today);
    }
}
