package ivlev.ivlevback.scheduled;

import ivlev.ivlevback.service.SuppliesService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MakeSupplyInvisibleScheduler {

    private final SuppliesService suppliesService;

    public MakeSupplyInvisibleScheduler(SuppliesService suppliesService) {
        this.suppliesService = suppliesService;
    }

    @Scheduled(cron = "0 0 0 * * *", zone = "Europe/Moscow")
    public void hideOldSupplies() {
        suppliesService.hideSuppliesWithOldAcceptanceDate();
    }
}

