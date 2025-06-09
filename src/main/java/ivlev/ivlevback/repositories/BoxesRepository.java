package ivlev.ivlevback.repositories;

import ivlev.ivlevback.models.Box;
import ivlev.ivlevback.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoxesRepository extends JpaRepository<Box, Integer> {

    @Modifying
    void deleteAllByOrder(Orders order);

    @Modifying
    @Query("DELETE FROM Box b WHERE b.order.id = :orderId")
    void deleteAllByOrderId(@Param("orderId") int orderId);
}
