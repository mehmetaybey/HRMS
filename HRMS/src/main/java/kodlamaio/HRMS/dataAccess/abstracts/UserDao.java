package kodlamaio.HRMS.dataAccess.abstracts;

import kodlamaio.HRMS.entities.abstracts.User;
import kodlamaio.HRMS.entities.concretes.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
