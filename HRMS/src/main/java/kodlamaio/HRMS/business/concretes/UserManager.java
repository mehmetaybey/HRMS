package kodlamaio.HRMS.business.concretes;

import kodlamaio.HRMS.business.abstracts.UserService;
import kodlamaio.HRMS.core.Utilities.results.DataResult;
import kodlamaio.HRMS.core.Utilities.results.Result;
import kodlamaio.HRMS.core.Utilities.results.SuccessDataResult;
import kodlamaio.HRMS.core.Utilities.results.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.UserDao;
import kodlamaio.HRMS.entities.abstracts.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {
    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public DataResult<List<User>> getAll() {

        return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Data Listelendi");
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("ürün eklendi");
    }
}
