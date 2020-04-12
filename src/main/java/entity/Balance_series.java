package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="balance_series")
public class Balance_series {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ser_id")
    int id;

    @Column(name="ser_quantity")
    double quantity;

    @ManyToOne
    @JoinColumn(name = "ser_stock")
    Stock stock;

    @ManyToOne
    @JoinColumn(name="ser_stock_doc")
    Stock_doc doc;

    @ManyToOne
    @JoinColumn(name="ser_typeoperation")
    Type_operation typeoperation;

    @ManyToOne
    @JoinColumn(name="ser_portfolio")
   Portfolio portfolio;

    @OneToMany (mappedBy = "series", cascade = CascadeType.ALL)
    List<Stock_doc_table> doc_tables = new ArrayList<Stock_doc_table>();

    public Balance_series(){

    }
}
