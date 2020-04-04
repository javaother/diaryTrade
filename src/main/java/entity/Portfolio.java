package entity;

import javax.persistence.*;

@Entity
@Table(name="portfolio")
public class Portfolio {

    @Id
    @OneToMany
    @Column(name="id_portfolio")
    int id;

    @Column(name="name_portfolio")
    String name;

    @Column(name="comment_portfolio")
    String comment;

    public Portfolio(){

    }
}
