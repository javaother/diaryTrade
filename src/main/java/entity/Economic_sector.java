package entity;

import javax.persistence.*;

@Entity
@Table(name="economic_sector")
public class Economic_sector {

    @Id
    @OneToMany
    @Column(name="es_id")
    int id;

    @Column(name="es_name")
    String name;

    public Economic_sector() {

    }
}
