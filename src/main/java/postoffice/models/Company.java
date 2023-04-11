package postoffice.models;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "companies")

public class Company {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;

    Company() {
    }

    public Company(String name) {
    }

    public Long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }


}


