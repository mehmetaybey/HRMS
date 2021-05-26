package kodlamaio.HRMS.entities.concretes;

import kodlamaio.HRMS.entities.abstracts.Entities;
import kodlamaio.HRMS.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor
public class Employer extends User implements Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "company_name",nullable = false)
    private String companyName;

    @Column(name = "web_adress",nullable = false)
    private String webAdress;

    @Column(name = "phone_number",nullable = false)
    private String telephoneNumber;


}
