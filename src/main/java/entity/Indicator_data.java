package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="indicator_data")
public class Indicator_data implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name="id_indata")
    Indicator id_indicator;

    @Id
    @Column(name="date_indata")
    Date date_indicator;

    @Column(name="value_indata")
    Double value;

    public Indicator_data(){

    }
}
