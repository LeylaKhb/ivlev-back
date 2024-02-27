package ivlev.ivlevback.dto;

public class DestinationWarehouseDTO {
    private String warehouseName;

    public DestinationWarehouseDTO(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }
}
