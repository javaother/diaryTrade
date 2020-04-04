package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="indices")
public class Indices {

    @Id
    @OneToMany
    @Column(name="idx_ticker")
    String id;

    @Column(name="idx_name")
    String name;

    @Column(name="idx_date")
    Date date_idx;

    public Indices(){

    }
}
