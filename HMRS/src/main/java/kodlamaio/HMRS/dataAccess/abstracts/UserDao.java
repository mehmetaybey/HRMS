package kodlamaio.HMRS.dataAccess.abstracts;

import kodlamaio.HMRS.entities.abstracts.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
