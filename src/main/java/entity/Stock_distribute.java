package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="stock_distribute")
public class Stock_distribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="stkdi_id")
    int id;

    @Column(name="stkdi_date")
    Date date_stk;

    @Column(name="stkdi_number")
    String number;

    @OneToMany (mappedBy = "docid", cascade = CascadeType.ALL)
    List<Stock_price> prices = new ArrayList<Stock_price>();

    public Stock_distribute(){

    }
}
