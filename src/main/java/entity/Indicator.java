package entity;

import javax.persistence.*;

@Entity
@Table(name="indicator")
public class Indicator {

    @Id
    @OneToMany
    @Column(name="id_indicator")
    int id;

    @Column(name="name_indicator")
    String name;

    @Column(name="source_indicator")
    String source;

    @Column(name="purpose_indicator")
    String purpose;

    public Indicator(){

    }
}
