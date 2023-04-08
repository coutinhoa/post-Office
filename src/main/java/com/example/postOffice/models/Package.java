package com.example.postOffice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.Internal;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Timestamp;
import java.util.Date;

import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "packages")
public class Package {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private double weight;
    private Date delivery_date;


    @ManyToOne
    @JoinColumn(name="sender_id", nullable=false)
    @JoinColumn(name="addressee_id", nullable=false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private User user;


    Package() {
    }

    public Package( double weight, Date delivery_date) {
        this.weight = weight;
        this.delivery_date = delivery_date;
    }

    public Long getId() {
        return this.id;
    }
    public double getWeight() {
        return this.weight;
    }
    public Date getDelivery_date() {
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
