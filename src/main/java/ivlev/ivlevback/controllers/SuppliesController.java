package ivlev.ivlevback.controllers;

import ivlev.ivlevback.dto.SupplyDTO;
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
    public List<SupplyDTO> getSupplies() {
        return suppliesService.getAll();
    }
}
