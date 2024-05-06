package ivlev.ivlevback.models;

import jakarta.persistence.*;

@Entity
@Table(name = "answer_request")
public class AnswerRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String store;
    private String service;

    @Column(name = "first_time")
    private String firstTime;
    private String item;
    private String connect;


    public AnswerRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(String firstTime) {
        this.firstTime = firstTime;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getConnect() {
        return connect;
    }

    public void setConnect(String connect) {
        this.connect = connect;
    }

    @Override
    public String toString() {
        if (store == null) {
            return "Имя: " + name + ", номер телефона: " + phoneNumber;
        } else {
            return "Имя: " + name + ", номер телефона: " + phoneNumber + ", склад: " + store + ", услуга: " + service +
                    ", отгрузка впервые: " + firstTime + ", товар: " + item + ", способ связи: " + connect;
        }
    }
}
