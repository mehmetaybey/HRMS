package kodlamaio.HMRS.entities.concretes;

import kodlamaio.HMRS.entities.abstracts.Entities;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employee_confirms_employers")
public class EmployeeConfirmEmployer implements Entities {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "employeer_id")
    private int employerId;

    public EmployeeConfirmEmployer() {

    }


    public EmployeeConfirmEmployer(int id, int employerId) {
        this.id = id;
        this.employerId = employerId;
    }




    public int getEmployerId() {
        return employerId;
    }

    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }
}
