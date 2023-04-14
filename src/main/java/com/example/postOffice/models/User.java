package com.example.postOffice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
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
    @JsonIgnore
    private List<Package> packages_sent;


    @OneToMany(mappedBy = "addressee")
    private List<Package> packages_received;

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

    /*public List<Package> getPackagesSent() {
        return this.packages_sent;
    }

    /*public List<Package> getPackagesReceived() {
        return this.packages_received;
    }*/


    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name= name;
    }
    public void setEmail(String email) {
        this.email= email;
    }

    /*public void setPackagesSent(List<Package> packagesSent) {
        this.packages_sent= packagesSent;
    }

    /*public void setPackagesReceived(List<Package> packagesReceived) {
        this.packages_received= packagesReceived;
    }*/



}

