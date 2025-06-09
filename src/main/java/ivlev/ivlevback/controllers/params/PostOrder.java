package ivlev.ivlevback.controllers.params;

public class PostOrder {
    private String id;
    private String orderid;

    public PostOrder(String id, String orderid) {
        this.id = id;
        this.orderid = orderid;
    }

    public PostOrder() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    @Override
    public String toString() {
        return "PostOrder{" +
                "id='" + id + '\'' +
                ", orderid='" + orderid + '\'' +
                '}';
    }
}
