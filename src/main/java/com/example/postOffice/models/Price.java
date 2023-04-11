package com.example.postOffice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "prices")

public class Price {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private double price;

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
    public void setId(Long id) {
        this.id = id;
    }
    public void setPrice(double price) {
        this.price = price;
    }


}


