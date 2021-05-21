package kodlamaio.HMRS.entities.concretes;

import kodlamaio.HMRS.entities.abstracts.Entities;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "jop_titles")
public class JopTitles implements Entities {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    public JopTitles(){

    }

    public JopTitles(int id, String title) {
        this.setId(id);
        this.setTitle(title);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
