package kodlamaio.HMRS.entities.concretes;

import kodlamaio.HMRS.entities.abstracts.Entities;
import kodlamaio.HMRS.entities.abstracts.User;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "candidates")
public class Candidate extends User implements Entities {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name = "identity_number")
    private String identityNumber;

    @Column(name = "birth_year")
    private int dateBirth;

    public Candidate(){

    }
    public Candidate(int id, String firstName, String lastName, String identityNumber, int dateBirth) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setIdentityNumber(identityNumber);
        this.setDateBirth(dateBirth);
    }

    public Candidate(int id, String email, String password, int id1, String firstName, String lastName, String identityNumber, int dateBirth) {
        super(id, email, password);
        this.setId(id1);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setIdentityNumber(identityNumber);
        this.setDateBirth(dateBirth);
    }


    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public int getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(int dateBirth) {
        this.dateBirth = dateBirth;
    }
}