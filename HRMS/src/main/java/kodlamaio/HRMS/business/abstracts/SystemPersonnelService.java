package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.core.Utilities.results.DataResult;
import kodlamaio.HRMS.core.Utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.SystemPersonnel;

import java.util.List;

public interface SystemPersonnelService {
    DataResult<List<SystemPersonnel>>getAll();
    Result add(SystemPersonnel systemPersonnel);
    Result update(SystemPersonnel systemPersonnel);
    Result delete(int id);
    Result checkSystempersonnelmail(String email);
    Result checkidentityNumber(String identityNumber);
}
