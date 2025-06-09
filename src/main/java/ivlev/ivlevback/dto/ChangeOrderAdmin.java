package ivlev.ivlevback.dto;

import ivlev.ivlevback.models.Orders;

import java.util.List;

public class ChangeOrderAdmin {
    private List<Orders> orders;
    private String status;
    private String changeable;
    private String paymentStatus;
    private String paymentSite;

    public ChangeOrderAdmin() {
    }

    public String getPaymentSite() {
        return paymentSite;
    }

    public void setPaymentSite(String paymentSite) {
        this.paymentSite = paymentSite;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public String getChangeable() {
        return changeable;
    }

    public void setChangeable(String changeable) {
        this.changeable = changeable;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
