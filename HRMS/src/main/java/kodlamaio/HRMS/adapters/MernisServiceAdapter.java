package kodlamaio.HRMS.adapters;

import kodlamaio.HRMS.business.abstracts.MernisCheckService;
import kodlamaio.HRMS.business.concretes.MernisValidate;
import kodlamaio.HRMS.entities.concretes.Candidate;
import org.springframework.stereotype.Service;

@Service
public class MernisServiceAdapter implements MernisCheckService {


    @Override
    public boolean checkIfRealPerson(Candidate candidate) {

        return new MernisValidate().checkIfRealPerson(
                candidate.getIdentityNumber(),
                candidate.getFirstName(),
                candidate.getLastName(),
                candidate.getDateBirth());

    }
}
