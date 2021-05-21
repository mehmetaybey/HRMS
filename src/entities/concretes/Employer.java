package entities.concretes;

import entities.abstracts.Entities;

public class Employer implements Entities {
    private int id;
    private String  companyName;
    private String eMail;
    private String password;
    private String webAdress;
    private String telephone;

    public Employer(){

    }

    public Employer(int id, String companyName, String eMail, String password, String webAdress, String telephone) {
        this.id = id;
        this.companyName = companyName;
        this.eMail = eMail;
        this.password = password;
        this.webAdress = webAdress;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWebAdress() {
        return webAdress;
    }

    public void setWebAdress(String webAdress) {
        this.webAdress = webAdress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
