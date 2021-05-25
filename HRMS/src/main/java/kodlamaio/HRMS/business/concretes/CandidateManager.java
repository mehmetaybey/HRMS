package kodlamaio.HRMS.business.concretes;

import kodlamaio.HRMS.business.abstracts.CandidateService;
import kodlamaio.HRMS.core.Utilities.results.DataResult;
import kodlamaio.HRMS.core.Utilities.results.Result;
import kodlamaio.HRMS.core.Utilities.results.SuccessDataResult;
import kodlamaio.HRMS.core.Utilities.results.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.CandidateDao;
import kodlamaio.HRMS.entities.abstracts.User;
import kodlamaio.HRMS.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {
    private CandidateDao candidateDao;

    @Autowired
    public CandidateManager(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),"Data Listelendi");
    }

    @Override
    public Result add(Candidate candidate) {
        this.candidateDao.save(candidate);
        return new SuccessResult("Kişi eklendi");
    }
}
