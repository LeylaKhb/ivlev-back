package ivlev.ivlevback.repositories;

import ivlev.ivlevback.models.Orders;
import ivlev.ivlevback.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
    List<Orders> findByPerson(Person person);
    List<Orders> findByPersonAndStatus(Person person, String status);

}
