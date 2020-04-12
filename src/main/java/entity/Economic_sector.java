package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="economic_sector")
public class Economic_sector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="es_id")
    int id;

    @Column(name="es_name")
    String name;

    @OneToMany (mappedBy = "sector", cascade = CascadeType.ALL)
    List<Stock> stocks = new ArrayList<Stock>();


    public Economic_sector() {

    }
}
