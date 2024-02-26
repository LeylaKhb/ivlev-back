package ivlev.ivlevback.repositories;

import ivlev.ivlevback.models.Supply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuppliesRepository extends JpaRepository<Supply, Long> {
}
