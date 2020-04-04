package entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "stock")
public class Stock {

    @Id
    /*@OneToMany(mappedBy = "stock", fetch=FetchType.EAGER)
    @JoinColumn(name = "stk_ticker")*/
    @Column(name = "stk_ticker")
    int ticker;

    @ManyToOne
    //@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "stk_esid")
    //@Column(name = "stk_esid")
    Economic_sector sector;

    @Column(name = "stk_name")
    String name;

    @Column(name = "stk_date")
    Date dateCreate;

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
