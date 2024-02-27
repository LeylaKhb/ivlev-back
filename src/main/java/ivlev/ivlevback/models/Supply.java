package ivlev.ivlevback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @ManyToOne
    @JoinColumn(name="title_id", nullable=false)
    @JsonIgnore
    private SupplyTitleType titleType;

    public Supply() {
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

    public SupplyTitleType getTitleType() {
        return titleType;
    }

    public void setTitleType(SupplyTitleType titleType) {
        this.titleType = titleType;
    }

    //    @Override
//    public String toString() {
//        return "Supply{" +
//                "id=" + id +
//                ", departureDate=" + departureDate +
//                ", acceptanceDate=" + acceptanceDate +
//                ", title='" + title + '\'' +
////                ", warehouses=" + warehouses +
////                ", departureCities=" + departureCities +
//                '}';
//    }
}

