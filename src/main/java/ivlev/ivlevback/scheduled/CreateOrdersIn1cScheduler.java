package ivlev.ivlevback.scheduled;

import ivlev.ivlevback.service.OrdersService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//@Component
public class CreateOrdersIn1cScheduler {
    private final OrdersService ordersService;

    public CreateOrdersIn1cScheduler(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @Scheduled(cron = "0 */5 * * * *")
    public void create() {
        ordersService.createOrdersIn1c();
    }
}
