package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "type_move")
public class Type_move {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "move_id")
    int id;

    @Column(name = "move_name")
    String name;

    @OneToMany (mappedBy = "move", cascade = CascadeType.ALL)
    List<Stock_doc> doc = new ArrayList<Stock_doc>();

    public Type_move(){

    }
}
