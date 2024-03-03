package ivlev.ivlevback.controllers;

import ivlev.ivlevback.config.ResponseBody;
import ivlev.ivlevback.dto.PriceRequestDTO;
import ivlev.ivlevback.models.PriceRequest;
import ivlev.ivlevback.models.AnswerRequest;
import ivlev.ivlevback.service.RequestsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RequestsController {
    private final RequestsService requestsService;

    public RequestsController(RequestsService requestsService) {
        this.requestsService = requestsService;
    }

    @PostMapping("/answer_request")
    public void getRequest(@RequestBody AnswerRequest request) {
        requestsService.save(request);
    }

    @PostMapping("/calculator")
    public ResponseBody count(@RequestBody PriceRequestDTO priceRequestDTO) {
        PriceRequest priceRequest = requestsService.findByStoreAndSendCity(priceRequestDTO.getStore(),
                priceRequestDTO.getSendCity());

        double volume = priceRequestDTO.getVolume();
        double result = 0;
        
        if (priceRequestDTO.getDepartureCity().equals("Самара")) result += 100;
        else result += 200;
        if (priceRequestDTO.isWillTaken()) result += 600;

        String price;
        if (priceRequestDTO.isPallet()) {
            if (volume < 1.5) {
                volume = 1.5;
            }
        }

        if (priceRequestDTO.getSendCity().equals("Преображенка") || priceRequestDTO.getSendCity().equals("Чапаевск")) {
            if (priceRequestDTO.isPallet()) result += 1600;
            else result += priceRequestDTO.getAmount() * priceRequest.getMinSum();
        } else {
            if (volume < 0.1) {
                volume = 1.5;
                result += priceRequest.getMinSum();
            } else {
                result += (priceRequest.getSum() * volume);
            }
        }

//        if (result % 1 == 0) {
//            price = String.valueOf(result);
//        } else {
            price = String.format("%.2f", result);
//        }

        return new ResponseBody("answer", price + "/" + volume);
    }
}
