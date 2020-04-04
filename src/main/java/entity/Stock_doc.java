package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="stock_doc")
public class Stock_doc {

    @Id
    @OneToMany
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
    int move;

    public Stock_doc(){

    }
}
