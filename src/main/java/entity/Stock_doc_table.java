package entity;

import javax.persistence.*;

@Entity
@Table(name="stock_doc_table")
public class Stock_doc_table {

    @Id
    @Column(name="stkpd_id")
    int id;

    @Id
    @ManyToOne
    @JoinColumn(name="stkpd_doc")
    int doc;

    @Column(name="stkpd_quantity")
    double quantity;

    @Column(name="stkpd_price")
    double price;

    @ManyToOne
    @JoinColumn(name="stkpd_portfolio")
    int portfolio;

    @ManyToOne
    @JoinColumn(name="stkpd_typeoperation")
    int typeoperation;

    @ManyToOne
    @JoinColumn(name="stkpd_stock")
    String stock;

    @ManyToOne
    @JoinColumn(name="stkpd_series")
    int series;

    public Stock_doc_table(){

    }
}
