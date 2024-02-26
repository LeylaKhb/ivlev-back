package ivlev.ivlevback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "departure_city")
public class DepartureCity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="supply_id", nullable=false)
    @JsonIgnore
    private Supply supply;

    private String city;

    public DepartureCity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "DepartureCity{" +
                "id=" + id +
                ", supply=" + supply +
                ", city='" + city + '\'' +
                '}';
    }
}


