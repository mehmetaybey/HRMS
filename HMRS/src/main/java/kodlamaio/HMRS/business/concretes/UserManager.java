package kodlamaio.HMRS.business.concretes;

import kodlamaio.HMRS.business.abstracts.UserService;
import kodlamaio.HMRS.dataAccess.abstracts.UserDao;
import kodlamaio.HMRS.entities.abstracts.User;
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
    public List<User> getAll() {
        return this.userDao.findAll();
    }
}
