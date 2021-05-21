package kodlamaio.HMRS.entities.concretes;

import kodlamaio.HMRS.entities.abstracts.Entities;
import kodlamaio.HMRS.entities.abstracts.User;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employers")
public class Employer extends User implements Entities {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_adress")
    private String webAdress;

    @Column(name = "phone_number")
    private String telephoneNumber;

    public Employer(){

    }
    public Employer(int id, String companyName, String webAdress, String telephoneNumber) {
        this.setId(id);
        this.setCompanyName(companyName);
        this.setWebAdress(webAdress);
        this.setTelephoneNumber(telephoneNumber);
    }

    public Employer(int id, String email, String password, int id1, String companyName, String webAdress, String telephoneNumber) {
        super(id, email, password);
        this.setId(id1);
        this.setCompanyName(companyName);
        this.setWebAdress(webAdress);
        this.setTelephoneNumber(telephoneNumber);
    }


    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebAdress() {
        return webAdress;
    }

    public void setWebAdress(String webAdress) {
        this.webAdress = webAdress;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
