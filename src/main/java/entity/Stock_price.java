package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="stock_price")
public class Stock_price implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "stock")
    Stock stock;

    @Id
    @Column(name = "date")
    Date date_price;

    @Column(name = "price")
    double price;

    @Column(name = "fixed")
    int fixed;

    @ManyToOne
    @JoinColumn(name = "docid_stkpr")
    Stock_distribute docid;

    public Stock_price(){

    }
}
