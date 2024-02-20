package ivlev.ivlevback.repositories;

import ivlev.ivlevback.models.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestsRepository extends JpaRepository<Request, Integer> {
}
