package ivlev.ivlevback.models;

import java.util.List;

public class InboundData {
    public Orders order;
    public List<Box> boxes;

    public Orders getOrder() {
        return order;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    @Override
    public String toString() {
        return "InboundData{" +
                "order=" + order +
                ", boxes=" + boxes +
                '}';
    }
}
