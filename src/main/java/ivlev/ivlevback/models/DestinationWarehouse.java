package ivlev.ivlevback.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;


@Entity
@Table(name = "destination_warehouse")
public class DestinationWarehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="supply_id", nullable=false)
    @JsonIgnore
    private Supply supply;

    private String warehouse;

    public DestinationWarehouse() {
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

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "DestinationWarehouse{" +
                "id=" + id +
                ", supply=" + supply +
                ", warehouse='" + warehouse + '\'' +
                '}';
    }
}
