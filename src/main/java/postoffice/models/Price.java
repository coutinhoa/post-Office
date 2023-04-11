package postoffice.models;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "prices")

public class Price {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private double price;

    @ManyToOne
    @JoinColumn(name="senderCountry")
    private Country senderCountry;

    @ManyToOne
    @JoinColumn(name="addresseeCountry")
    private Country addresseeCountry;





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


