package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="stock_price")
public class Stock_price {

    @Id
    @ManyToOne
    @JoinColumn(name = "stock")
    String stock;

    @Id
    @Column(name = "date")
    Date date_price;

    @Column(name = "price")
    double price;

    @Column(name = "fixed")
    int fixed;

    @ManyToOne
    @JoinColumn(name = "docid_stkpr")
    int docid;

    public Stock_price(){

    }
}
