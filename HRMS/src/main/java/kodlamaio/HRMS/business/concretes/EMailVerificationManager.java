package kodlamaio.HRMS.business.concretes;

import kodlamaio.HRMS.business.abstracts.EmailVerificationService;
import kodlamaio.HRMS.core.Utilities.results.ErrorDataResult;
import kodlamaio.HRMS.core.Utilities.results.Result;
import kodlamaio.HRMS.core.Utilities.results.SuccessDataResult;
import kodlamaio.HRMS.core.Utilities.verification.RandomCode;
import kodlamaio.HRMS.dataAccess.abstracts.EmailVerificationDao;
import kodlamaio.HRMS.entities.concretes.EmailVerification;

public class EMailVerificationManager implements EmailVerificationService {

    private EmailVerificationDao emailVerificationDao;

    public EMailVerificationManager(EmailVerificationDao emailVerificationDao) {
        this.emailVerificationDao = emailVerificationDao;
    }


    @Override
    public void generateCode(EmailVerification code, Integer id) {
        EmailVerification code_ = code;
        code.setCode(null);
        code.setVerified(false);
        if (code.isVerified() == false) {
            RandomCode genereator = new RandomCode();
            String code_crate = genereator.create();
            code.setCode(code_crate);
            code.setUserId(id);

            emailVerificationDao.save(code);
        }
        return;
    }

    @Override
    public Result verify(String veriFicationCode, Integer id) {
        EmailVerification ref = emailVerificationDao.findByUserId(id).stream().findFirst().get();
        if (ref.getCode().equals(veriFicationCode) && ref.isVerified() != true) {
            ref.setVerified(true);
            return new SuccessDataResult<EmailVerification>(this.emailVerificationDao.save(ref), "Başarılı");
        } else if (ref.isVerified() == true) {
            return new ErrorDataResult<EmailVerification>(null, "Zaten Doğrulanmış Hesap");
        }
        return new ErrorDataResult<EmailVerification>(null, "Doğrulama Kodu Geçersiz");
    }
}
