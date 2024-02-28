package ivlev.ivlevback.repositories;

import ivlev.ivlevback.models.Box;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoxesRepository extends JpaRepository<Box, Integer> {
}
