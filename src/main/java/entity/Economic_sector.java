package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="economic_sector")
public class Economic_sector {

    @Id
    @Column(name="es_id")
    int id;

    @Column(name="es_name")
    String name;

    @OneToMany (mappedBy = "sector")
    List<Stock> stocks = new ArrayList<Stock>();


    public Economic_sector() {

    }
}
