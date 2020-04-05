package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "indices_price")
public class Indices_price implements Serializable{

    @Id
    @ManyToOne
    @JoinColumn(name="index_indexprice")
    Indices index;

    @Id
    @Column(name="date_indexprice")
    Date date_index;

    @Column(name="price_indexprice")
    double price;

    @Column(name="fixed_indexprice")
    int fixed;

    @ManyToOne
    @JoinColumn(name="docid_indexprice")
    Indices_distribute docid;


    public Indices_price(){

    }
}
