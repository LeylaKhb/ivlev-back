package ivlev.ivlevback.models;

import java.time.LocalDate;

public class AdminRequest {
    private String departureCity;
    private String store;
    private String sendCity;
    private String phoneNumber;
    private String entity;
    private LocalDate startDepartureDate;
    private LocalDate endDepartureDate;
    private LocalDate startOrderDate;
    private LocalDate endOrderDate;
    private LocalDate acceptanceDate;
    private String status;
    private String sortBy;

    public AdminRequest() {
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getStartDepartureDate() {
        return startDepartureDate;
    }

    public void setStartDepartureDate(LocalDate startDepartureDate) {
        this.startDepartureDate = startDepartureDate;
    }

    public LocalDate getEndDepartureDate() {
        return endDepartureDate;
    }

    public void setEndDepartureDate(LocalDate endDepartureDate) {
        this.endDepartureDate = endDepartureDate;
    }

    public LocalDate getStartOrderDate() {
        return startOrderDate;
    }

    public void setStartOrderDate(LocalDate startOrderDate) {
        this.startOrderDate = startOrderDate;
    }

    public LocalDate getEndOrderDate() {
        return endOrderDate;
    }

    public void setEndOrderDate(LocalDate endOrderDate) {
        this.endOrderDate = endOrderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getAcceptanceDate() {
        return acceptanceDate;
    }

    public void setAcceptanceDate(LocalDate acceptanceDate) {
        this.acceptanceDate = acceptanceDate;
    }

    @Override
    public String toString() {
        return "AdminRequest{" +
                "departureCity='" + departureCity + '\'' +
                ", store='" + store + '\'' +
                ", sendCity='" + sendCity + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", entity='" + entity + '\'' +
                ", startDepartureDate=" + startDepartureDate +
                ", endDepartureDate=" + endDepartureDate +
                ", startOrderDate=" + startOrderDate +
                ", endOrderDate=" + endOrderDate +
                ", acceptanceDate=" + acceptanceDate +
                ", status='" + status + '\'' +
                ", sortBy='" + sortBy + '\'' +
                '}';
    }
}
