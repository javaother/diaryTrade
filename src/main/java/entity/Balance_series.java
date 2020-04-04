package entity;

import javax.persistence.*;

@Entity
@Table(name="balance_series")
public class Balance_series {

    @Id
    @OneToMany
    @Column(name="ser_id")
    int id;

    @ManyToOne
    @JoinColumn(name = "ser_stock")
    String stock;

    @ManyToOne
    @JoinColumn(name="ser_stock_doc")
    int doc;

    @Column(name="ser_quantity")
    double quantity;

    @ManyToOne
    @JoinColumn(name="ser_typeoperation")
    int typeoperation;

    @ManyToOne
    @JoinColumn(name="ser_portfolio")
    int portfolio;

    public Balance_series(){

    }
}
