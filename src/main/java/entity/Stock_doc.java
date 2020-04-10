package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="stock_doc")
public class Stock_doc {

    @Id
    @Column(name="docs_id")
    int id;

    @Column(name="docs_date")
    Date date_doc;

    @Column(name="docs_stocks")
    String stocks;

    @Column(name="docs_number")
    String number;

    @ManyToOne
    @JoinColumn(name="docs_move")
    Type_move move;

    @OneToMany (mappedBy = "doc")
    List<Stock_doc_table> doc_tables = new ArrayList<Stock_doc_table>();

    @OneToMany (mappedBy = "doc")
    List<Balance_series> series = new ArrayList<Balance_series>();

    public Stock_doc(){

    }
}
