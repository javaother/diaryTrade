package entity;

import utils.Utilites;

import javax.persistence.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "stock")
public class Stock implements Serializable{

    @Id
    @Column(name = "stk_ticker")
    private String ticker;

    @Column(name = "stk_name")
    private String name;

    @Column(name = "stk_date")
    private Date dateCreate;

    @ManyToOne
    //@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "stk_esid")
    private Economic_sector sector;

    @OneToMany (mappedBy = "stock")
    private List<Stock_doc_table> doc_tables = new ArrayList<Stock_doc_table>();

    @OneToMany (mappedBy = "stock")
    private List<Stock_divident> stock_dividents = new ArrayList<Stock_divident>();

    @OneToMany (mappedBy = "stock")
    private List<Balance_series> series = new ArrayList<Balance_series>();

    @OneToMany (mappedBy = "stock")
    private List<Stock_price> prices = new ArrayList<Stock_price>();

    public Stock() {/*constructor*/}

    //getters
    public String getTicker() {
        return ticker;
    }

    public String getName() {
        return name;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public Economic_sector getSector() {
        return sector;
    }

    /*public String getStock() {
        return ticker + " - " + name;
    }*/

    @Override
    public String toString() {
        return //"Stock{" +
                ticker +
               // ", sector=" + sector +
                " - " + name +
                "(" + Utilites.formatDateWithoutTime(dateCreate) + ")";
    }
}
