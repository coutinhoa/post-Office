package com.example.postOffice.models;

import jakarta.persistence.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "prices")
@Component
public class Price {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private double price;

    private Long senderCountryId;

    private Long addresseeCountryId;

    Price() {
    }

    public Price(double price) {
    }

    public Long getId() {
        return this.id;
    }
    public double getPrice() {
        return this.price;
    }

    public Long getSenderCountry() {
        return this.senderCountryId;
    }

    public Long getAddresseeCountry() {
        return this.addresseeCountryId;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setSenderCountry(Long senderCountry) {
        this.senderCountryId =senderCountry;
    }
    public void setAddresseeCountry(Long addresseeCountry) {
        this.addresseeCountryId = addresseeCountry;
    }


}


