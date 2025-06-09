package ivlev.ivlevback.dto;

public class CompanyDTO {
    private String companyName;
    private String inn;

    public CompanyDTO() {
    }

    public CompanyDTO(String companyName, String inn) {
        this.companyName = companyName;
        this.inn = inn;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }
}
