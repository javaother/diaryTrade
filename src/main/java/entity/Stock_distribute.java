package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="stock_distribute")
public class Stock_distribute {

    @Id
    @OneToMany
    @Column(name="stkdi_id")
    int id;

    @Column(name="stkdi_date")
    Date date_stk;

    @Column(name="stkdi_number")
    String number;

    public Stock_distribute(){

    }
}
