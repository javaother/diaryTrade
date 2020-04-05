package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="indicator")
@Embeddable
public class Indicator implements Serializable {

    @Id
    @Column(name="id_indicator")
    int id;

    @Column(name="name_indicator")
    String name;

    @Column(name="source_indicator")
    String source;

    @Column(name="purpose_indicator")
    String purpose;

    @OneToMany (mappedBy = "id_indicator")
    List<Indicator_data> indicator_data = new ArrayList<Indicator_data>();

    public Indicator(){

    }
}
