package entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="indices_distribute")
public class Indices_distribute {

    @Id
    @Column(name="idxdi_id")
    int id;

    @Column(name="idxdi_date")
    Date date_idxdi;

    @Column(name="idxdi_number")
    String number;

    @OneToMany (mappedBy = "docid")
    List<Indices_price> prices = new ArrayList<Indices_price>();

    public Indices_distribute(){

    }
}
