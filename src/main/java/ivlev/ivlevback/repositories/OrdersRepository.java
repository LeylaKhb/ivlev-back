package ivlev.ivlevback.repositories;

import ivlev.ivlevback.models.Orders;
import ivlev.ivlevback.models.Person;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
    List<Orders> findByPersonAndStatusOrderByDepartureDateDesc(Person person, String status);

    List<Orders> findByPersonAndStatusIsNotOrderByDepartureDateDesc(Person person, String status);

    @Query(value = "SELECT * FROM orders o " +
            "WHERE " +
            "(o.departure_city = :departureCity or :departureCity = '') and " +
            "(o.send_city = :sendCity or :sendCity = '') and " +
            "(o.store = :store or :store = '') and " +
            "(o.phone_number = :phoneNumber or :phoneNumber = '') and " +
            "(o.entity like %:entity% or :entity = '') and " +
            "(o.status = :status or :status = '') and " +
            "(o.departure_date >= :startDepartureDate or cast(:startDepartureDate as date) is null) and " +
            "(o.departure_date <= :endDepartureDate or cast(:endDepartureDate as date) is null) and " +
            "(o.order_date >= :startOrderDate or cast(:startOrderDate as date) is null) and " +
            "(o.order_date <= :endOrderDate or cast(:endOrderDate as date) is null) and " +
            "(o.acceptance_date = :acceptanceDate or cast(:acceptanceDate as date) is null)",
            nativeQuery = true)
    List<Orders> findForAdmin(@Param("departureCity") String departureCity, @Param("store") String store,
                              @Param("sendCity") String sendCity, @Param("phoneNumber") String phoneNumber,
                              @Param("entity") String entity,
                              @Param("status") String status, @Param("startDepartureDate") LocalDate startDepartureDate,
                              @Param("endDepartureDate") LocalDate endDepartureDate,
                              @Param("startOrderDate")LocalDate startOrderDate,
                              @Param("endOrderDate") LocalDate endOrderDate,
                              @Param("acceptanceDate") LocalDate acceptanceDate);


    @Query(value = "SELECT * FROM orders o " +
            "WHERE " +
            "(o.departure_city = :departureCity or :departureCity = '') and " +
            "(o.send_city = :sendCity or :sendCity = '') and " +
            "(o.store = :store or :store = '') and " +
            "(o.phone_number = :phoneNumber or :phoneNumber = '') and " +
            "(o.status = :status or :status = '') and " +
            "(o.departure_date >= :startDepartureDate or cast(:startDepartureDate as date) is null) and " +
            "(o.departure_date <= :endDepartureDate or cast(:endDepartureDate as date) is null) and " +
            "(o.order_date >= :startOrderDate or cast(:startOrderDate as date) is null) and " +
            "(o.order_date <= :endOrderDate or cast(:endOrderDate as date) is null) and " +
            "(o.acceptance_date = :acceptanceDate or cast(:acceptanceDate as date) is null) " +
            "order by ?#{#sort}",
            nativeQuery = true)
    List<Orders> findForAdminAndSort(@Param("departureCity") String departureCity, @Param("store") String store,
                                     @Param("sendCity") String sendCity, @Param("phoneNumber") String phoneNumber,
                                     @Param("status") String status, @Param("startDepartureDate") LocalDate startDepartureDate,
                                     @Param("endDepartureDate") LocalDate endDepartureDate,
                                     @Param("startOrderDate")LocalDate startOrderDate,
                                     @Param("endOrderDate") LocalDate endOrderDate,
                                     @Param("acceptanceDate") LocalDate acceptanceDate,
                                     Sort sort);

    List<Orders> findAllByStatus1cFalse();
}
