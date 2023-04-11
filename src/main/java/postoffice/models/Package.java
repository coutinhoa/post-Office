package postoffice.models;

import jakarta.persistence.*;

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
    @JoinColumn(name="sender_id")
    private User sender;

    @ManyToOne
    @JoinColumn(name="addressee_id")
    private User addressee;


    @ManyToOne
    @JoinColumn(name="sender_country")
    private Country sender_country;

    @ManyToOne
    @JoinColumn(name="addressee_country")
    private Country addressee_country;


    public Package() {


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
