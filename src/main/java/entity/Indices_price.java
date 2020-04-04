package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "indices_price")
public class Indices_price {

    @Id
    @ManyToOne
    @JoinColumn(name="index_indexprice")
    String index;

    @Id
    @Column(name="date_indexprice")
    Date date_index;

    @Column(name="price_indexprice")
    double price;

    @Column(name="fixed_indexprice")
    int fixed;

    @ManyToOne
    @JoinColumn(name="docid_indexprice")
    int docid;


    public Indices_price(){

    }
}
