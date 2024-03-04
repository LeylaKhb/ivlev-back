package ivlev.ivlevback.repositories;

import ivlev.ivlevback.models.Box;
import ivlev.ivlevback.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoxesRepository extends JpaRepository<Box, Integer> {

    void deleteAllByOrder(Orders order);
}
