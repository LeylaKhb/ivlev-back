package ivlev.ivlevback.controllers;

import ivlev.ivlevback.models.Request;
import ivlev.ivlevback.repositories.RequestsRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestsController {
    private final RequestsRepository requestsRepository;

    public RequestsController(RequestsRepository requestsRepository) {
        this.requestsRepository = requestsRepository;
    }

    @PostMapping("/api/request")
    public void getRequest(@RequestBody Request request) {
        requestsRepository.save(request);
    }
}
