package ivlev.ivlevback.dto;

public class DepartureCityDTO {
    private String cityName;

    public DepartureCityDTO(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
