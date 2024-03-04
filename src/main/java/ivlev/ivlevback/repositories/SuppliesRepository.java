package ivlev.ivlevback.repositories;

import ivlev.ivlevback.models.Supply;
import ivlev.ivlevback.models.SupplyTitleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface SuppliesRepository extends JpaRepository<Supply, Long> {
    Supply findByDepartureDateAndTitleType(LocalDate departureDate, SupplyTitleType supplyTitleType);

    Supply findByTitleType(SupplyTitleType supplyTitleType);
}
