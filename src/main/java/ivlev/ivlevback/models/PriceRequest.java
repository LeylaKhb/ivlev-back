package ivlev.ivlevback.models;

import jakarta.persistence.*;

@Entity
@Table(name = "price_request")
public class PriceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String store;

    @Column(name = "send_city")
    private String sendCity;

    @Column(name = "min_sum")
    private int minSum;
    private int sum;

    public PriceRequest() {
    }

    public int getMinSum() {
        return minSum;
    }

    public void setMinSum(int minSum) {
        this.minSum = minSum;
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

    public String getSendCity() {
        return sendCity;
    }

    public void setSendCity(String sendCity) {
        this.sendCity = sendCity;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "PriceRequest{" +
                "id=" + id +
                ", store='" + store + '\'' +
                ", sendCity='" + sendCity + '\'' +
                ", minSum=" + minSum +
                ", sum=" + sum +
                '}';
    }
}
