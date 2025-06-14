package ivlev.ivlevback.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String entity;
    @Column(name = "order_date")
    private LocalDate orderDate;
    @Column(name = "departure_date")
    private LocalDate departureDate;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "send_city")
    private String sendCity;
    @Column(name = "departure_city")
    private String departureCity;
    private String store;
    @Column(name = "supply_type")
    private String supplyType;
    private float volume;
    private String price;
    private String status;
    @Column(name = "will_taken")
    private boolean willTaken;
    @Column(name = "payment_site")
    private boolean paymentSite;

    @Column(name = "payment_status")
    private boolean paymentStatus;
    private String comment;
    @Column(name = "number_ozon")
    private String numberOzon;
    private boolean changeable;
    @OneToMany(mappedBy = "order")
    private List<Box> boxes;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Person person;

    @Column(name = "supply_title")
    private String supplyTitle;

    @Column(name = "acceptance_date")
    private LocalDate acceptanceDate;

    @Column(name = "status_1c")
    private boolean status1c;

    @Column(name = "inn")
    private String inn;

    public Orders() {
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public LocalDate getAcceptanceDate() {
        return acceptanceDate;
    }

    public void setAcceptanceDate(LocalDate acceptanceDate) {
        this.acceptanceDate = acceptanceDate;
    }

    public boolean isPaymentSite() {
        return paymentSite;
    }

    public void setPaymentSite(boolean paymentSite) {
        this.paymentSite = paymentSite;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getSupplyTitle() {
        return supplyTitle;
    }

    public void setSupplyTitle(String supplyTitle) {
        this.supplyTitle = supplyTitle;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSendCity() {
        return sendCity;
    }

    public void setSendCity(String sendCity) {
        this.sendCity = sendCity;
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

    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isWillTaken() {
        return willTaken;
    }

    public void setWillTaken(boolean willTaken) {
        this.willTaken = willTaken;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String isNumberOzon() {
        return numberOzon;
    }

    public void setNumberOzon(String numberOzon) {
        this.numberOzon = numberOzon;
    }

    public boolean isChangeable() {
        return changeable;
    }

    public void setChangeable(boolean changeable) {
        this.changeable = changeable;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }

    public String getNumberOzon() {
        return numberOzon;
    }

    public boolean isStatus1c() {
        return status1c;
    }

    public void setStatus1c(boolean status1c) {
        this.status1c = status1c;
    }
}
