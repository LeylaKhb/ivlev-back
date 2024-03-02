package ivlev.ivlevback.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "supply_title_type")
public class SupplyTitleType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    @OneToMany(mappedBy = "titleType")
    private List<DestinationWarehouse> warehouses;

    @OneToMany(mappedBy = "titleType")
    private List<DepartureCity> departureCities;

    public List<DestinationWarehouse> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(List<DestinationWarehouse> warehouses) {
        this.warehouses = warehouses;
    }

    public List<DepartureCity> getDepartureCities() {
        return departureCities;
    }

    public void setDepartureCities(List<DepartureCity> departureCities) {
        this.departureCities = departureCities;
    }

    public SupplyTitleType() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "SupplyTitleType{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", warehouses=" + warehouses +
                ", departureCities=" + departureCities +
                '}';
    }
}
