package ivlev.ivlevback.controllers;

import ivlev.ivlevback.models.AdminRequest;
import ivlev.ivlevback.models.Orders;
import ivlev.ivlevback.service.OrdersService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdminController {
    private final OrdersService ordersService;

    public AdminController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @PostMapping("/admin")
    public List<Orders> getAdminOrders(@RequestBody AdminRequest adminRequest) {
        return ordersService.findForAdmin(adminRequest);
    }
}
