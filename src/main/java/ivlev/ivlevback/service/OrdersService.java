package ivlev.ivlevback.service;

import ivlev.ivlevback.models.Box;
import ivlev.ivlevback.models.Orders;
import ivlev.ivlevback.repositories.BoxesRepository;
import ivlev.ivlevback.repositories.OrdersRepository;
import ivlev.ivlevback.security.PersonDetails;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class OrdersService {
    private final OrdersRepository ordersRepository;
    private final BoxesRepository boxesRepository;

    public OrdersService(OrdersRepository ordersRepository, BoxesRepository boxesRepository) {
        this.ordersRepository = ordersRepository;
        this.boxesRepository = boxesRepository;
    }

    public void save(PersonDetails personDetails, Orders order, List<Box> boxList) {
        order.setOrderDate(new Date(System.currentTimeMillis()));
        order.setStatus("Не оплачен");
        order.setChangeable(true);
        order.setPerson(personDetails.getPerson());
        ordersRepository.save(order);

        for (Box box : boxList) {
            box.setOrder(order);
            boxesRepository.save(box);
        }
    }

    public List<Orders> getAll(PersonDetails personDetails) {
        return ordersRepository.findByPersonAndStatus(personDetails.getPerson(), "Доставлен");
    }

    public List<Orders> getAllCurrentOrders(PersonDetails personDetails) {
        return ordersRepository.findByPerson(personDetails.getPerson());
    }

}
