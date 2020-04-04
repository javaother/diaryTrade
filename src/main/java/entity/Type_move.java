package entity;

import javax.persistence.*;

@Entity
@Table(name = "type_move")
public class Type_move {

    @Id
    @OneToMany
    @Column(name = "move_id")
    int id;

    @Column(name = "move_name")
    String name;

    public Type_move(){

    }
}
