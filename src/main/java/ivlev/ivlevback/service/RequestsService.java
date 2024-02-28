package ivlev.ivlevback.service;


import ivlev.ivlevback.models.AnswerRequest;
import ivlev.ivlevback.models.PriceRequest;
import ivlev.ivlevback.repositories.AnswerRequestsRepository;
import ivlev.ivlevback.repositories.PriceRequestsRepository;
import org.springframework.stereotype.Service;

@Service
public class RequestsService {
    private final AnswerRequestsRepository answerRequestsRepository;
    private final PriceRequestsRepository priceRequestsRepository;

    public RequestsService(AnswerRequestsRepository answerRequestsRepository, PriceRequestsRepository priceRequestsRepository) {
        this.answerRequestsRepository = answerRequestsRepository;
        this.priceRequestsRepository = priceRequestsRepository;
    }

    public void save(AnswerRequest answerRequest) {
        answerRequestsRepository.save(answerRequest);
    }

    public PriceRequest findByStoreAndSendCity(String store, String city) {
        return priceRequestsRepository.findByStoreAndSendCity(store, city);
    }
}
