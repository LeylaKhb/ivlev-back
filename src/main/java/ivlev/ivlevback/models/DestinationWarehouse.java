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
    @JoinColumn(name="title_id", nullable=false)
    @JsonIgnore
    private SupplyTitleType titleType;

    @Column(name = "warehouse_name")
    private String warehouseName;
    private String store;

    @Column(name = "send_city")
    private String sendCity;

    public DestinationWarehouse() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public SupplyTitleType getTitleType() {
        return titleType;
    }

    public void setTitleType(SupplyTitleType title) {
        this.titleType = title;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getSendCity() {
        return sendCity;
    }

    public void setSendCity(String sendCity) {
        this.sendCity = sendCity;
    }

    //    @Override
//    public String toString() {
//        return "DestinationWarehouse{" +
//                "id=" + id +
//                ", supply=" + supply +
//                ", warehouse='" + warehouse + '\'' +
//                '}';
//    }
}
