package kodlamaio.HRMS.dataAccess.abstracts;

import kodlamaio.HRMS.entities.concretes.JopTitles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JopTitlesDao extends JpaRepository<JopTitles,Integer> {
}
