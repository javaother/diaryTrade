package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="stock_doc_table")
public class Stock_doc_table implements Serializable {

    @Id
    @Column(name="stkpd_id")
    int id;

    @Id
    @ManyToOne
    @JoinColumn(name="stkpd_doc")
    Stock_doc doc;

    @Column(name="stkpd_quantity")
    double quantity;

    @Column(name="stkpd_price")
    double price;

    @ManyToOne
    @JoinColumn(name="stkpd_portfolio")
    Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name="stkpd_typeoperation")
    Type_operation typeoperation;

    @ManyToOne
    @JoinColumn(name="stkpd_stock")
    Stock stock;

    @ManyToOne
    @JoinColumn(name="stkpd_series")
    Balance_series series;

    public Stock_doc_table(){

    }
}
