package com.example.postOffice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


import java.util.Optional;
import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;


    @OneToMany(mappedBy = "senderCountry")
    private Set<Package> sender_country;

    @OneToMany(mappedBy = "addresseeCountry")
    private Set<Package> addressee_country;

    Country() {
    }

    public Country(String name) {
        this.name = name;
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
        this.name=name;
    }

}