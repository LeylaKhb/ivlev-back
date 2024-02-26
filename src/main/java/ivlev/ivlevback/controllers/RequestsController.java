package ivlev.ivlevback.controllers;

import ivlev.ivlevback.config.ResponseBody;
import ivlev.ivlevback.dto.PriceRequestDTO;
import ivlev.ivlevback.models.PriceRequest;
import ivlev.ivlevback.models.Request;
import ivlev.ivlevback.repositories.PriceRequestsRepository;
import ivlev.ivlevback.repositories.RequestsRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestsController {
    private final RequestsRepository requestsRepository;
    private final PriceRequestsRepository priceRequestsRepository;

    public RequestsController(RequestsRepository requestsRepository, PriceRequestsRepository priceRequestsRepository) {
        this.requestsRepository = requestsRepository;
        this.priceRequestsRepository = priceRequestsRepository;
    }

    @PostMapping("/api/request")
    public void getRequest(@RequestBody Request request) {
        requestsRepository.save(request);
    }

    @PostMapping("/api/calculator")
    public ResponseBody count(@RequestBody PriceRequestDTO priceRequestDTO) {
        PriceRequest priceRequest = priceRequestsRepository.findByStoreAndSendCity(priceRequestDTO.getStore(),
                priceRequestDTO.getSendCity());
        float volume = priceRequestDTO.getVolume();
        System.out.println(priceRequest.getSendCity());
        System.out.println(priceRequestDTO.getVolume());
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
