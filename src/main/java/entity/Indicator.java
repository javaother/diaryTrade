package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="indicator")
public class Indicator{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_indicator")
    int id;

    @Column(name="name_indicator")
    String name;

    @Column(name="source_indicator")
    String source;

    @Column(name="purpose_indicator")
    String purpose;

    @OneToMany (mappedBy = "id_indicator", cascade = CascadeType.ALL)
    List<Indicator_data> indicator_data = new ArrayList<Indicator_data>();

    public Indicator(){

    }
}
