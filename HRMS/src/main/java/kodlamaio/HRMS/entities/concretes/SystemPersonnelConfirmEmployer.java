package kodlamaio.HRMS.entities.concretes;

import kodlamaio.HRMS.entities.abstracts.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employee_confirms_employers")
@AllArgsConstructor
@NoArgsConstructor
public class SystemPersonnelConfirmEmployer implements Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "employeer_id")
    private int employerId;
}


