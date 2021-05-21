package kodlamaio.HMRS.entities.concretes;

import kodlamaio.HMRS.entities.abstracts.Entities;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "verifaction_code_candidates")
public class VerifactionCodeCandidate  implements Entities {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private  int id;

    @Column(name = "candidate_id")
    private int candidateId;

    public VerifactionCodeCandidate(){

    }

    public VerifactionCodeCandidate(int id, int candidateId) {
        this.setId(id);
        this.setCandidateId(candidateId);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }


}
