package ivlev.ivlevback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "company_name")
    private String companyName;

    private String inn;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private Person person;

    public Company() {
    }

    public Company(long id, String companyName, String inn, Person person) {
        this.id = id;
        this.companyName = companyName;
        this.inn = inn;
        this.person = person;
    }

    public Company(String companyName, String inn, Person person) {
        this.companyName = companyName;
        this.inn = inn;
        this.person = person;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
