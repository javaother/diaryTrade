package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="portfolio")
public class Portfolio {

    @Id
    @Column(name="id_portfolio")
    int id;

    @Column(name="name_portfolio")
    String name;

    @Column(name="comment_portfolio")
    String comment;

    @OneToMany (mappedBy = "portfolio")
    List<Balance_series> series = new ArrayList<Balance_series>();

    @OneToMany (mappedBy = "portfolio")
    List<Stock_doc_table> doc_table = new ArrayList<Stock_doc_table>();

    public Portfolio(){

    }
}
