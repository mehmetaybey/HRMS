package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.core.Utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.EmailVerification;

public interface EmailVerificationService {
    void generateCode(EmailVerification code , Integer id);
    Result verify(String veriFicationCode,Integer id);
}
