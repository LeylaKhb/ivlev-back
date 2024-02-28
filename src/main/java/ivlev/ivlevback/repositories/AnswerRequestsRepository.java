package ivlev.ivlevback.repositories;

import ivlev.ivlevback.models.AnswerRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRequestsRepository extends JpaRepository<AnswerRequest, Integer> {
}
