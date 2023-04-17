package com.example.postOffice.models;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;
import java.util.Date;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "packages")
@Component
public class Package {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private double weight;
    private Date delivery_date;
    private double delivery_price;

    @ManyToOne
    @JoinColumn(name="sender_id")
    private User sender;

    @ManyToOne
    @JoinColumn(name="addressee_id", nullable = false, referencedColumnName = "id")
    private User addressee;

    @ManyToOne
    @JoinColumn(name="sender_country_id", nullable = false, referencedColumnName = "id")
    private Country sender_country;

    @ManyToOne
    @JoinColumn(name="addressee_country_id", nullable = false, referencedColumnName = "id")
    private Country addressee_country;

    public Package() {
    }

    public Package( double weight, Date delivery_date, double delivery_price) {
        this.weight = weight;
        this.delivery_date = delivery_date;
        this.delivery_price =delivery_price;
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

    public User getSender() {
        return this.sender;
    }

    public User getAddressee() {
        return this.addressee;
    }

    public Country getSenderCountry() {
        return this.sender_country;
    }

    public Country getAddresseeCountry() {
        return this.addressee_country;
    }

    public Double getDelivery_price() {
        return this.delivery_price;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setWeight(double weight) {
        this.weight= weight;
    }
    public void setDelivery_date(Date delivery_date) {
        this.delivery_date= delivery_date;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public void setAddressee(User addressee) {
        this.addressee= addressee;
    }

    public void setSenderCountry(Country sender) {
        this.sender_country= sender;
    }

    public void setAddressee_country(Country addressee) {
        this.addressee_country= addressee;
    }

    public void setDelivery_price(Double delivery_price) {
        this.delivery_price= delivery_price;
    }

}
