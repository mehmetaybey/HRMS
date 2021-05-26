package kodlamaio.HRMS.dataAccess.abstracts;

import kodlamaio.HRMS.entities.concretes.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateDao extends JpaRepository<Candidate,Integer> {
    List<Candidate> findAllByEmail(String email);
    List<Candidate> findAllByIdentityNumber(String identityNumber);
}
