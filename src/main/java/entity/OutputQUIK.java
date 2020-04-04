package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="outputquik")
public class OutputQUIK {

    @Id
    @Column(name="stock_code")
    String stock_code;

    @Column(name="date_trading")
    String date_trading;

    @Column(name="stock_name")
    String stock_name;

    @Column(name="price_index")
    double price_index;

    @Column(name="price_stock")
    double price_stock;

    public OutputQUIK(){

    }
}
