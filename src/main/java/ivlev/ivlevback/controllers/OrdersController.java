package ivlev.ivlevback.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ivlev.ivlevback.config.ResponseBody;
import ivlev.ivlevback.models.Box;
import ivlev.ivlevback.models.InboundData;
import ivlev.ivlevback.models.Orders;
import ivlev.ivlevback.security.PersonDetails;
import ivlev.ivlevback.service.OrdersService;
import ivlev.ivlevback.utils.LocalDateTypeAdapter;
import org.hibernate.query.Order;
import org.json.simple.parser.ParseException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class OrdersController {
    private final OrdersService ordersService;
    private final Gson gson = new GsonBuilder()
            .registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter())
            .create();


    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @PostMapping("/new_order")
    public ResponseBody createOrder(@RequestBody String jsonString) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();

        Orders order;
        List<Box> boxes;

        InboundData x = gson.fromJson(jsonString, InboundData.class);
        order = x.getOrder();
        boxes = x.getBoxes();
        ordersService.save(personDetails, order, boxes);
        return new ResponseBody("ok", "");
    }

    @GetMapping("/current_orders")
    public List<Orders> getOrders() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = null;
        try {
            personDetails = (PersonDetails) authentication.getPrincipal();
        } catch (ClassCastException ex) {
            System.out.println("principal " + authentication.getPrincipal());
            System.out.println("credentioals " + authentication.getCredentials());
        }
        assert personDetails != null;
        return ordersService.getAllCurrentOrders(personDetails);

    }

    @GetMapping("/orders_history")
    public List<Orders> getAllOrders() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();

        return ordersService.getAll(personDetails);
    }

    @PostMapping("/delete_order")
    public ResponseBody deleteOrder(@RequestBody Orders order) {
        ordersService.delete(order);
        return new ResponseBody("ok", "");
    }
}
