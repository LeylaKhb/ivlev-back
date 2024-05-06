package ivlev.ivlevback.repositories;

import ivlev.ivlevback.models.Orders;
import ivlev.ivlevback.models.Supply;
import ivlev.ivlevback.models.SupplyTitleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SuppliesRepository extends JpaRepository<Supply, Long> {
    Supply findByDepartureDateAndTitleType(LocalDate departureDate, SupplyTitleType supplyTitleType);

    Supply findByTitleType(SupplyTitleType supplyTitleType);

    @Query(value = "SELECT * FROM supply order by id",
            nativeQuery = true)
    List<Supply> findAllAndOrder();
}
