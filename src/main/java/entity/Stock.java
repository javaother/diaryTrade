package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "stock")
public class Stock {
    @Id
    @Column(name = "stk_ticker")
    String ticker;

    //@ManyToOne
    //@JoinColumn(name = "stk_esid")
    @Column(name = "stk_esid")
    int sector;

    @Column(name = "stk_name")
    String name;

    @Column(name = "stk_date")
    Date dateCreate;

    public Stock() {

    }

    public String getStock() {
        return ticker + " - " + name;
    }
}
