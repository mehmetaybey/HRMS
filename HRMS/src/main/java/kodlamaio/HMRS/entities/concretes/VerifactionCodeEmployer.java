package kodlamaio.HMRS.entities.concretes;

import kodlamaio.HMRS.entities.abstracts.Entities;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "verifaction_code_employers")
public class VerifactionCodeEmployer implements Entities {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "employer_id")
    private int employerId;

    public VerifactionCodeEmployer(){

    }

    public VerifactionCodeEmployer(int id, int employerId) {
        this.setId(id);
        this.setEmployerId(employerId);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployerId() {
        return employerId;
    }

    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }
}
