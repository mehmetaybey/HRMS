package kodlamaio.HRMS.entities.concretes;

import kodlamaio.HRMS.entities.abstracts.Entities;
import kodlamaio.HRMS.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
public class SystemPersonnel extends User implements Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "identity_number",nullable = false)
    private String identityNumber;



}
