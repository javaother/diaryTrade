package entity;

import javax.persistence.*;

@Entity
@Table(name = "type_operation")
public class Type_operation {

    @Id
    @OneToMany
    @Column(name = "top_id")
    int id;

    @Column(name = "top_name")
    String name;

    public Type_operation(){

    }
}
