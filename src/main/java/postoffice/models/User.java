package postoffice.models;

import jakarta.persistence.*;

import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private String email;


    @OneToMany(mappedBy = "sender")
    private Set<Package> packages_sent;

    @OneToMany(mappedBy = "addressee")
    private Set<Package> packages_received;

    User() {
    }

    public User(String name, String email) {
        this.name= name;
        this.email=email;

    }

    public Long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name= name;
    }
    public void setEmail(String email) {
        this.email= email;
    }


}

