package ivlev.ivlevback.scheduled;

import ivlev.ivlevback.service.SuppliesService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AutomaticFillingSuppliesScheduler {

    private final SuppliesService suppliesService;

    public AutomaticFillingSuppliesScheduler(SuppliesService suppliesService) {
        this.suppliesService = suppliesService;
    }

    @Scheduled(cron = "0 0 0 * * TUE", zone = "Europe/Moscow")
    public void copySuppliesForNextWeek() {
        suppliesService.copyNextWeekSuppliesToFollowingWeek();
    }
}

