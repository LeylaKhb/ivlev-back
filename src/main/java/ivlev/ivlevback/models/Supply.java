package ivlev.ivlevback.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "supply")
public class Supply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "departure_date")
    private Date departureDate;

    @Column(name = "acceptance_date")
    private Date acceptanceDate;
    private String title;

    @OneToMany(mappedBy = "supply")
    private List<DestinationWarehouse> warehouses;
//
    @OneToMany(mappedBy = "supply")
    private List<DepartureCity> departureCities;
    public Supply() {
    }

    public List<DepartureCity> getDepartureCities() {
        return departureCities;
    }

    public void setDepartureCities(List<DepartureCity> departureCities) {
        this.departureCities = departureCities;
    }

    public List<DestinationWarehouse> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(List<DestinationWarehouse> warehouses) {
        this.warehouses = warehouses;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getAcceptanceDate() {
        return acceptanceDate;
    }

    public void setAcceptanceDate(Date acceptanceDate) {
        this.acceptanceDate = acceptanceDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Supply{" +
                "id=" + id +
                ", departureDate=" + departureDate +
                ", acceptanceDate=" + acceptanceDate +
                ", title='" + title + '\'' +
//                ", warehouses=" + warehouses +
//                ", departureCities=" + departureCities +
                '}';
    }
}

