package com.example.postOffice.models;
import jakarta.persistence.*;

import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;


    @OneToMany(mappedBy = "sender_country")
    private Set<Package> sender_country;

    @OneToMany(mappedBy = "addressee_country")
    private Set<Package> addressee_country;

    /*@OneToMany(mappedBy = "senderCountry")
    private Set<Price> senderCountry;

    @OneToMany(mappedBy = "addresseeCountry")
    private Set<Price> addresseeCountry;*/

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

  /*  public Set<Package> getSenderCountry() {
        return this.sender_country;
    }

    public Set<Package> getAddresseeCountry() {
        return this.addressee_country;
    }*/

    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name=name;
    }

   /*public void setSenderCoutry() {
        this.sender_country= sender_country;
    }

    public void setAddressee_country() {
        this.addressee_country= addressee_country;
    }*/

}