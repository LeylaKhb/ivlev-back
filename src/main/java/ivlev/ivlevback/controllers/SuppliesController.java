package ivlev.ivlevback.controllers;

import ivlev.ivlevback.dto.SupplyDTO;
import ivlev.ivlevback.models.Supply;
import ivlev.ivlevback.security.PersonDetails;
import ivlev.ivlevback.service.SuppliesService;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
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

    @PostMapping("/get_supply")
    public SupplyDTO getSupply(@RequestBody String jsonString) throws ParseException {
        Object obj = new JSONParser().parse(jsonString);
        JSONObject jo = (JSONObject) obj;
        String strDepartureDate = (String) jo.get("departureDate");
        String[] timeParts = strDepartureDate.split("-");
        LocalDate departureDate = LocalDate.of(Integer.parseInt(timeParts[0]), Integer.parseInt(timeParts[1]), Integer.parseInt(timeParts[2]));
        String title = (String) jo.get("title");

        SupplyDTO supply = suppliesService.findByDepartureDateAndSendCity(departureDate, title);
        return supply;

    }
}
