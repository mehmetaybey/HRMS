package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.core.Utilities.results.DataResult;
import kodlamaio.HRMS.core.Utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employer>>getAll();
    Result add(Employer employer);
}
