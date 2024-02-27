package ivlev.ivlevback.dto;


import ivlev.ivlevback.models.DepartureCity;

import java.util.Date;
import java.util.List;

public class SupplyDTO {
    private Date departureDate;
    private Date acceptanceDate;
    private String title;
    private List<DestinationWarehouseDTO> warehouses;
    private List<DepartureCityDTO> departureCities;

    public SupplyDTO(Date departureDate, Date acceptanceDate, String title, List<DestinationWarehouseDTO> warehouses, List<DepartureCityDTO> departureCities) {
        this.departureDate = departureDate;
        this.acceptanceDate = acceptanceDate;
        this.title = title;
        this.warehouses = warehouses;
        this.departureCities = departureCities;
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

    public List<DestinationWarehouseDTO> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(List<DestinationWarehouseDTO> warehouses) {
        this.warehouses = warehouses;
    }

    public List<DepartureCityDTO> getDepartureCities() {
        return departureCities;
    }

    public void setDepartureCities(List<DepartureCityDTO> departureCities) {
        this.departureCities = departureCities;
    }
}
