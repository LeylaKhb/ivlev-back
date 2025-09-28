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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.util.List;

@RestController
public class OrdersController {
    @Value("${secret_paykeeper_word}")
    private String secretPaykeeperWord;
    private final OrdersService ordersService;
    private final Gson gson = new GsonBuilder()
            .registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter())
            .create();


    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @PostMapping("/change_status_after_payment")
    public String changeStatusAfterPayment(@RequestParam String id, @RequestParam String orderid,
                                                 @RequestParam String sum) {
        String answer = "OK " + getMd5Hash(id + secretPaykeeperWord);
        ordersService.changeStatusAfterPayment(orderid, sum);
        return answer;
    }

    @PostMapping("/new_order")
    public Orders createOrder(@RequestBody String jsonString) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();

        Orders order;
        List<Box> boxes;

        InboundData x = gson.fromJson(jsonString, InboundData.class);
        order = x.getOrder();
        boxes = x.getBoxes();
        return ordersService.save(personDetails, order, boxes);
    }

    @GetMapping("/current_orders")
    public List<Orders> getOrders() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = null;
        try {
            personDetails = (PersonDetails) authentication.getPrincipal();
        } catch (ClassCastException ignored) {
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

    public String getMd5Hash(String source) {
        try {
            var md = MessageDigest.getInstance("MD5");
            md.update(source.getBytes());
            byte[] digest = md.digest();
            return bytesToHex(digest);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private String bytesToHex(byte[] bytes) {
        var builder = new StringBuilder();
        for (var b : bytes) {
            builder.append(String.format("%02x", b & 0xff));
        }
        return builder.toString();
    }
}
