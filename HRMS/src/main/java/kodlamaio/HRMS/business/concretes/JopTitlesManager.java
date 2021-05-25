package kodlamaio.HRMS.business.concretes;

import kodlamaio.HRMS.business.abstracts.JopTitlesService;
import kodlamaio.HRMS.core.Utilities.results.DataResult;
import kodlamaio.HRMS.core.Utilities.results.Result;
import kodlamaio.HRMS.core.Utilities.results.SuccessDataResult;
import kodlamaio.HRMS.core.Utilities.results.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.JopTitlesDao;
import kodlamaio.HRMS.entities.concretes.JopTitles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JopTitlesManager implements JopTitlesService {
    private JopTitlesDao jopTitlesDao;

    @Autowired
    public JopTitlesManager(JopTitlesDao jopTitlesDao) {
        this.jopTitlesDao = jopTitlesDao;
    }

    @Override
    public DataResult<List<JopTitles>> getAll() {
        return new SuccessDataResult<List<JopTitles>>(this.jopTitlesDao.findAll());
    }

    @Override
    public Result add(JopTitles jopTitles) {
        this.jopTitlesDao.save(jopTitles);
        return new SuccessResult("İş pozisyonu eklendi");
    }
}
