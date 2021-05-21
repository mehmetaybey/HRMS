package kodlamaio.HMRS.entities.concretes;

import kodlamaio.HMRS.entities.abstracts.Entities;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "employee_confirms")
public class EmployeeConfirm implements Entities {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "employee_id")
    private int employee_id;

    @Column(name ="is_confirmed" )
    private boolean isConfirmed;

    @Column(name = "confirm_date")
    private Date confirmDate;

    public EmployeeConfirm() {

    }

    public EmployeeConfirm(int id, boolean isConfirmed, Date confirmDate,int employee_id) {
        this.setId(id);
        this.setConfirmed(isConfirmed);
        this.setConfirmDate(confirmDate);
        this.setEmployee_id(employee_id);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
}
