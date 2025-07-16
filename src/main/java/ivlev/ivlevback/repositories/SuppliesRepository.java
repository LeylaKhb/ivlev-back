package ivlev.ivlevback.repositories;

import ivlev.ivlevback.models.Supply;
import ivlev.ivlevback.models.SupplyTitleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface SuppliesRepository extends JpaRepository<Supply, Long> {
    Supply findByDepartureDateAndTitleType(LocalDate departureDate, SupplyTitleType supplyTitleType);

    Supply findByTitleType(SupplyTitleType supplyTitleType);

    List<Supply> findAllByOrderByIdAsc();

    List<Supply> findByAcceptanceDateLessThanEqualAndVisibleTrue(Date date);

    List<Supply> findByDepartureDateBetween(Date fromDate, Date toDate);
}
