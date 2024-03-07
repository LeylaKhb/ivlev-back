package ivlev.ivlevback.dto;

import ivlev.ivlevback.models.Orders;

import java.util.List;

public class ChangeOrderAdmin {
    private List<Orders> orders;
    private String status;
    private String changeable;

    public ChangeOrderAdmin() {
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
