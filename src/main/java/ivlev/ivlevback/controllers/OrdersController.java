package ivlev.ivlevback.controllers;

import com.google.gson.Gson;
import ivlev.ivlevback.config.ResponseBody;
import ivlev.ivlevback.models.Box;
import ivlev.ivlevback.models.InboundData;
import ivlev.ivlevback.models.Orders;
import ivlev.ivlevback.security.PersonDetails;
import ivlev.ivlevback.service.OrdersService;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class OrdersController {
    private final OrdersService ordersService;
    private final Gson gson = new Gson();


    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @PostMapping("/new_order")
    public ResponseBody createOrder(@RequestBody String jsonString) throws ParseException {
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
}
