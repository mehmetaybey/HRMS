package kodlamaio.HRMS.core.Utilities.verification;

import kodlamaio.HRMS.business.concretes.MernisValidate;
import kodlamaio.HRMS.entities.concretes.Candidate;

public class IdentityValidation {
    public static boolean isRealPerson(String identityNumber) {
        Candidate candidate = new Candidate();
        MernisValidate mernis = new MernisValidate();
        return mernis.checkIfRealPerson(candidate.getFirstName(),candidate.getLastName(),candidate.getIdentityNumber(),candidate.getDateBirth());
    }
}
