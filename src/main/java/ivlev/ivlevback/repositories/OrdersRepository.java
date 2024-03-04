package ivlev.ivlevback.repositories;

import ivlev.ivlevback.models.Orders;
import ivlev.ivlevback.models.Person;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
    List<Orders> findByPerson(Person person);
    List<Orders> findByPersonAndStatus(Person person, String status);
    List<Orders> findByPersonAndStatusIsNot(Person person, String status);
    @Query(value = "SELECT * FROM orders o WHERE " +
            "(o.departure_city = :departureCity or :departureCity = '') and " +
            "(o.send_city = :sendCity or :sendCity = '') and " +
            "(o.store = :store or :store = '') and " +
            "(o.phone_number = :phoneNumber or :phoneNumber = '') and " +
            "(o.status = :status or :status = '')",
            nativeQuery = true)
    List<Orders> findByDepartureCityAndStoreAndSendCityAndPhoneNumberAndStatus(@Param("departureCity") String departureCity,
                                                                           @Param("store") String store,
                                                                           @Param("sendCity") String sendCity,
                                                                           @Param("phoneNumber") String phoneNumber,
                                                                           @Param("status") String status);

    @Query(value = "SELECT * FROM orders o WHERE " +
            "(o.departure_city = :departureCity or :departureCity = '') and " +
            "(o.send_city = :sendCity or :sendCity = '') and " +
            "(o.store = :store or :store = '') and " +
            "(o.phone_number = :phoneNumber or :phoneNumber = '') and " +
            "(o.status = :status or :status = '') order by ?#{#sort}",
            nativeQuery = true)
    List<Orders> findByDepartureCityAndStoreAndSendCityAndPhoneNumberAndStatus(@Param("departureCity") String departureCity,
                                                                               @Param("store") String store,
                                                                               @Param("sendCity") String sendCity,
                                                                               @Param("phoneNumber") String phoneNumber,
                                                                               @Param("status") String status,
                                                                               Sort sort);

}
