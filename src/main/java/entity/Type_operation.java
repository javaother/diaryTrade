package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "type_operation")
public class Type_operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "top_id")
    int id;

    @Column(name = "top_name")
    String name;

    @OneToMany (mappedBy = "typeoperation", cascade = CascadeType.ALL)
    List<Balance_series> series = new ArrayList<Balance_series>();

    @OneToMany (mappedBy = "typeoperation", cascade = CascadeType.ALL)
    List<Stock_doc_table> doc_tables = new ArrayList<Stock_doc_table>();

    public Type_operation(){

    }
}
