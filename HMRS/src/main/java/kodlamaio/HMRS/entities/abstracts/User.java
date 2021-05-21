package kodlamaio.HMRS.entities.abstracts;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="users")
public abstract class User {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    public User(){

    }

    public User(int id, String email, String password) {
        this.setId(id);
        this.setEmail(email);
        this.setPassword(password);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
