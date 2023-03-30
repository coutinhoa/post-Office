package com.example.postOffice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.Internal;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "packages")
public class Package {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private double weight;
    private String delivery_date;

    Package() {
    }

    public Package( double weight, String delivery_date) {
        this.weight = weight;
        this.delivery_date = delivery_date;
    }

    public Long getId() {
        return this.id;
    }
    public double getWeight() {
        return this.weight;
    }
    public String getDelivery_date() {
        return this.delivery_date;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setWeight() {
        this.weight= weight;
    }
    public void setDelivery_date() {
        this.delivery_date= delivery_date;
    }

}
