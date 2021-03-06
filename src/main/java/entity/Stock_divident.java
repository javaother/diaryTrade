package entity;

import javax.persistence.*;

@Entity
@Table(name="stock_divident")
public class Stock_divident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="divs_id")
    int id;

    @Column(name="divs_amount")
    double amount;

    @Column(name="divs_year")
    int year;

    @ManyToOne
    @JoinColumn(name="divs_stock")
    Stock stock;

    public Stock_divident(){

    }
}
