package entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="indices_distribute")
public class Indices_distribute {

    @Id
    @OneToMany
    @Column(name="idxdi_id")
    int id;

    @Column(name="idxdi_date")
    Date date_idxdi;

    @Column(name="idxdi_number")
    String number;

    public Indices_distribute(){

    }
}
