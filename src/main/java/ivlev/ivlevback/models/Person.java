package ivlev.ivlevback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ivlev.ivlevback.chat.actor_participation.models.ActorParticipation;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    private String email;

    private String password;

    private String name;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String photo;
    @OneToMany(mappedBy = "person")
    @JsonIgnore
    private List<Orders> ordersList;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<ActorParticipation> actorParticipations;

    private Integer discount;

    @OneToMany(mappedBy = "person", fetch = FetchType.EAGER)
    private List<Company> companies;

    public Person() {
    }

    public Integer getDiscount() {
        return discount;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<ActorParticipation> getActorParticipations() {
        return actorParticipations;
    }

    public void setActorParticipations(List<ActorParticipation> actorParticipations) {
        this.actorParticipations = actorParticipations;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
