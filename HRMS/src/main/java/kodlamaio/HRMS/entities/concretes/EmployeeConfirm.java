package kodlamaio.HRMS.entities.concretes;

import kodlamaio.HRMS.entities.abstracts.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "employee_confirms")
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeConfirm implements Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "employee_id")
    private int employee_id;

    @Column(name ="is_confirmed" )
    private boolean isConfirmed;

    @Column(name = "confirm_date")
    private Date confirmDate;


}
