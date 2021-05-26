package kodlamaio.HRMS.entities.concretes;

import kodlamaio.HRMS.entities.abstracts.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "jop_titles")
@AllArgsConstructor
@NoArgsConstructor
public class JopTitles implements Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title",nullable = false)
    private String title;


}
