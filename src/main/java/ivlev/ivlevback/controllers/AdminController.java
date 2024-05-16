package ivlev.ivlevback.controllers;

import ivlev.ivlevback.dto.ChangeOrderAdmin;
import ivlev.ivlevback.models.AdminRequest;
import ivlev.ivlevback.models.Orders;
import ivlev.ivlevback.models.Person;
import ivlev.ivlevback.service.OrdersService;
import ivlev.ivlevback.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdminController {
    private final OrdersService ordersService;
    private final PersonService personService;

    public AdminController(OrdersService ordersService, PersonService personService) {
        this.ordersService = ordersService;
        this.personService = personService;
    }

    @PostMapping("/admin")
    public List<Orders> getAdminOrders(@RequestBody AdminRequest adminRequest) {
        return ordersService.findForAdmin(adminRequest);
    }

    @PostMapping("/admin_discount")
    public List<Person> getAdminPeople(@RequestBody(required = false) String email) {
        return personService.findByEmail(email);
    }

    @PostMapping("/admin_change_discount")
    public void changeAdminOrders(@RequestBody Person person) {
        personService.changeDiscount(person);
    }

    @PostMapping("/admin_change")
    public void changeAdminOrders(@RequestBody ChangeOrderAdmin adminRequest) {
        ordersService.changeAdmin(adminRequest);
    }
}
