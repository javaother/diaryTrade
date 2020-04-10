package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @Column(name = "stk_ticker")
    int ticker;

    @Column(name = "stk_name")
    String name;

    @Column(name = "stk_date")
    Date dateCreate;

    @ManyToOne
    //@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "stk_esid")
    Economic_sector sector;

    @OneToMany (mappedBy = "stock")
    List<Stock_doc_table> doc_tables = new ArrayList<Stock_doc_table>();

    @OneToMany (mappedBy = "stock")
    List<Stock_divident> stock_dividents = new ArrayList<Stock_divident>();

    @OneToMany (mappedBy = "stock")
    List<Balance_series> series = new ArrayList<Balance_series>();

    @OneToMany (mappedBy = "stock")
    List<Stock_price> prices = new ArrayList<Stock_price>();

    public Stock() {

    }

    public String getStock() {
        return ticker + " - " + name;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "ticker=" + ticker +
                ", sector=" + sector +
                ", name='" + name + '\'' +
                ", dateCreate=" + dateCreate +
                '}';
    }
}
