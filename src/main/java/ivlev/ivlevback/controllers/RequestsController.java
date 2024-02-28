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
        float volume = priceRequestDTO.getVolume();
        int price;
        if (volume < 0.1) {
            price = priceRequest.getMinSum();
        } else {
            price = Math.round(priceRequest.getSum() * priceRequestDTO.getVolume());
        }
        if (priceRequestDTO.getDepartureCity().equals("Самара")) price += 100;
        else price += 200;

        return new ResponseBody("price", String.valueOf(price));
    }
}
