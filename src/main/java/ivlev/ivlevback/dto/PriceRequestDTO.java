package ivlev.ivlevback.dto;

public class PriceRequestDTO {
    private String departureCity;
    private String store;
    private String sendCity;
    private float volume;
    private boolean willTaken;
    private boolean isPallet;
    private int amount;

    public String getDepartureCity() {
        return departureCity;
    }

    public boolean isWillTaken() {
        return willTaken;
    }

    public void setWillTaken(boolean willTaken) {
        this.willTaken = willTaken;
    }

    public boolean isPallet() {
        return isPallet;
    }

    public void setPallet(boolean pallet) {
        isPallet = pallet;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "PriceRequestDTO{" +
                "departureCity='" + departureCity + '\'' +
                ", store='" + store + '\'' +
                ", sendCity='" + sendCity + '\'' +
                ", volume=" + volume +
                ", willTaken=" + willTaken +
                ", isPallet=" + isPallet +
                ", amount=" + amount +
                '}';
    }
}
