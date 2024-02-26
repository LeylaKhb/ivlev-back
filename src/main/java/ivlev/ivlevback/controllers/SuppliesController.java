package ivlev.ivlevback.controllers;

import ivlev.ivlevback.models.Supply;
import ivlev.ivlevback.service.SuppliesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SuppliesController {
    private final SuppliesService suppliesService;

    public SuppliesController(SuppliesService suppliesService) {
        this.suppliesService = suppliesService;
    }

    @GetMapping("/schedule")
    public List<Supply> getSupplies() {
        List<Supply> supplies = suppliesService.getAll();
        System.out.println(supplies.get(0).getWarehouses());
        System.out.println();
        return suppliesService.getAll();
    }
}
