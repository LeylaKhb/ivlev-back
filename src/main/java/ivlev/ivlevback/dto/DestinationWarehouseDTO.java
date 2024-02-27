package ivlev.ivlevback.dto;

import jakarta.persistence.Column;

public class DestinationWarehouseDTO {
    private String warehouseName;
    private String store;
    private String sendCity;

    public DestinationWarehouseDTO(String warehouseName, String store, String sendCity) {
        this.warehouseName = warehouseName;
        this.store = store;
        this.sendCity = sendCity;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
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
}
