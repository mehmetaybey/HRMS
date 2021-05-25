package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.entities.concretes.Candidate;
import org.springframework.stereotype.Service;

@Service
public interface MernisCheckService {
     boolean checkIfRealPerson(Candidate candidate);

}
