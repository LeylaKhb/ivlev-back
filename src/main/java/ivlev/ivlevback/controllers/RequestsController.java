package ivlev.ivlevback.controllers;

import ivlev.ivlevback.config.ResponseBody;
import ivlev.ivlevback.dto.PriceRequestDTO;
import ivlev.ivlevback.models.Person;
import ivlev.ivlevback.models.PriceRequest;
import ivlev.ivlevback.models.AnswerRequest;
import ivlev.ivlevback.security.PersonDetails;
import ivlev.ivlevback.service.RequestsService;
import ivlev.ivlevback.utils.TelegramUtil;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class RequestsController {
    private final RequestsService requestsService;
    private final TelegramUtil telegramUtil;

    public RequestsController(RequestsService requestsService, TelegramUtil telegramUtil) {
        this.requestsService = requestsService;
        this.telegramUtil = telegramUtil;
    }

    @PostMapping("/answer_request")
    public void getRequest(@RequestBody AnswerRequest request) throws IOException {
        telegramUtil.sendMessage(request.toString(), "6109584204:AAHt4UYB0mkAM0lZLAG23JEYbXGGclYX7K0", 401159350);
        telegramUtil.sendMessage(request.toString(), "6109584204:AAHt4UYB0mkAM0lZLAG23JEYbXGGclYX7K0", 289373666);
        telegramUtil.sendMessage(request.toString(), "6109584204:AAHt4UYB0mkAM0lZLAG23JEYbXGGclYX7K0", 751041015);
    }

    @PostMapping("/calculator")
    public ResponseBody count(@RequestBody PriceRequestDTO priceRequestDTO) {
        PriceRequest priceRequest = requestsService.findByStoreAndSendCity(priceRequestDTO.getStore(),
                priceRequestDTO.getSendCity());


        double volume = priceRequestDTO.getVolume();
        double result = 0;
        
        if (priceRequestDTO.getDepartureCity().equals("Самара")) result += 100;
        else result += 200;
        if (priceRequestDTO.isWillTaken()) {
            if (priceRequestDTO.getDepartureCity().equals("Самара"))
                result += 600;
            else
                result += 1000;
        }

        String price;
        if (priceRequestDTO.isPallet()) {
            if (volume < 1.5) {
                volume = 1.5;
            }
        }

        if (priceRequestDTO.getSendCity().equals("Преображенка") || priceRequestDTO.getSendCity().equals("Чапаевск") ||
                priceRequestDTO.getSendCity().equals("Новосемейкино")) {
            if (priceRequestDTO.isPallet()) result += priceRequest.getSum();
            else {
                if (priceRequestDTO.getDepartureCity().equals("Самара")) {
                    result += priceRequestDTO.getAmount() * priceRequest.getMinSum();
                } else {
                    result += priceRequestDTO.getAmount() * (priceRequest.getMinSum() + 100);
                }
            }
            result -= 100;
        } else {
            if (volume < 0.1) {
                volume = 0.1;
                result += priceRequest.getMinSum();
            } else {
                result += (priceRequest.getSum() * volume);
            }
        }

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication.getPrincipal() instanceof PersonDetails personDetails) {
            Person person = personDetails.getPerson();
            result -= result * ((double) person.getDiscount() / 100);
        }

        if (priceRequestDTO.getSendCity().equals("Преображенка") && priceRequestDTO.getStore().equals("ТК")) {
            result = 600;
        }
//        if (result % 1 == 0) {
//            price = String.valueOf(result);
//        } else {
            price = String.format("%.2f", result);
//        }

        return new ResponseBody("answer", price + "/" + volume);
    }
}
