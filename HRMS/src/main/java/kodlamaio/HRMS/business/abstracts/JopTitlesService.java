package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.core.Utilities.results.DataResult;
import kodlamaio.HRMS.core.Utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.JopTitles;

import java.util.List;

public interface JopTitlesService {
    DataResult<List<JopTitles>>getAll();
    Result add(JopTitles jopTitles);
}
