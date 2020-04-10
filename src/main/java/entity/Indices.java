package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="indices")
public class Indices {

    @Id
    @Column(name="idx_ticker")
    String id;

    @Column(name="idx_name")
    String name;

    @Column(name="idx_date")
    Date date_idx;

    @OneToMany (mappedBy = "index")
    List<Indices_price> prices = new ArrayList<Indices_price>();

    public Indices(){

    }
}
