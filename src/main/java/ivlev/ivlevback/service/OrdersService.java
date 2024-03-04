package ivlev.ivlevback.service;

import ivlev.ivlevback.models.AdminRequest;
import ivlev.ivlevback.models.Box;
import ivlev.ivlevback.models.Orders;
import ivlev.ivlevback.repositories.BoxesRepository;
import ivlev.ivlevback.repositories.OrdersRepository;
import ivlev.ivlevback.security.PersonDetails;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;




@Service
public class OrdersService {
    private final OrdersRepository ordersRepository;
    private final BoxesRepository boxesRepository;
    private final ModelMapper modelMapper;


    public OrdersService(OrdersRepository ordersRepository, BoxesRepository boxesRepository, ModelMapper modelMapper) {
        this.ordersRepository = ordersRepository;
        this.boxesRepository = boxesRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional
    public void save(PersonDetails personDetails, Orders order, List<Box> boxList) {
        if (order.getId() != 0) {
            int id = order.getId();
            Orders newOrder = ordersRepository.findById(id).isPresent() ? ordersRepository.findById(id).get() : null;
            assert newOrder != null;
            modelMapper.map(order, newOrder);
            newOrder.setPerson(personDetails.getPerson());
            ordersRepository.save(newOrder);
            boxesRepository.deleteAllByOrder(order);
            order = newOrder;
        } else {
            order.setOrderDate(LocalDate.now());
            order.setStatus("Не оплачен");
            order.setChangeable(true);
            order.setPerson(personDetails.getPerson());
            ordersRepository.save(order);
        }
        for (Box box : boxList) {
            box.setOrder(order);
            boxesRepository.save(box);
        }
    }

    public List<Orders> getAll(PersonDetails personDetails) {
        return ordersRepository.findByPersonAndStatus(personDetails.getPerson(), "Доставлен");
    }

    public List<Orders> getAllCurrentOrders(PersonDetails personDetails) {
        return ordersRepository.findByPersonAndStatusIsNot(personDetails.getPerson(), "Доставлен");
    }

    public List<Orders> findForAdmin(AdminRequest adminRequest) {
        if (adminRequest.getSortBy().equals(""))
            return ordersRepository.findForAdmin(adminRequest.getDepartureCity(),
                adminRequest.getStore(), adminRequest.getSendCity(), adminRequest.getPhoneNumber(), adminRequest.getStatus(),
                    adminRequest.getStartDepartureDate(), adminRequest.getEndDepartureDate(),
                    adminRequest.getStartOrderDate(), adminRequest.getEndOrderDate());
        else
            return ordersRepository.findForAdminAndSort(adminRequest.getDepartureCity(),
                    adminRequest.getStore(), adminRequest.getSendCity(), adminRequest.getPhoneNumber(), adminRequest.getStatus(),
                    Sort.by(adminRequest.getSortBy()));
    }

}
