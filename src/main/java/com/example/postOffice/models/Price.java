package com.example.postOffice.models;

import jakarta.persistence.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "prices")
@Component
public class Price {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private double price;

    @ManyToOne
    @JoinColumn(name="sender_country_id", nullable = false, referencedColumnName = "id")
    private Country senderCountry;

    @ManyToOne
    @JoinColumn(name="addressee_country_id", nullable = false, referencedColumnName = "id")
    private Country addresseeCountry;

    public Price() {
    }

    public Price(double price) {
    }

    public Long getId() {
        return this.id;
    }
    public double getPrice() {
        return this.price;
    }
    public Country getSenderCountry() {
        return this.senderCountry;
    }

    public Country getAddresseeCountry() {
        return this.addresseeCountry;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setSenderCountry(Country senderCountry) {
        this.senderCountry =senderCountry;
    }
    public void setAddresseeCountry(Country addresseeCountry) {
        this.addresseeCountry = addresseeCountry;
    }


}


