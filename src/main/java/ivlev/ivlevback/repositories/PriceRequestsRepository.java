package ivlev.ivlevback.repositories;

import ivlev.ivlevback.models.PriceRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRequestsRepository extends JpaRepository<PriceRequest, Integer> {
    PriceRequest findByStoreAndSendCity(String store, String sendCity);
}
