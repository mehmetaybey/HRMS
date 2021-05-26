package kodlamaio.HRMS.entities.concretes;

import kodlamaio.HRMS.entities.abstracts.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "verification_codes")
@AllArgsConstructor
@NoArgsConstructor
public class EmailVerification implements Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "is_verified")
    private boolean isVerified;

    @Column(name = "verified_date")
    private Date verifiedDate;

    @Column(name="user_id")
    private int userId;

    public boolean isVerified() {
        return this.isVerified;
    }


}
