package quest.sbhiber.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import quest.sbhiber.entity.Student;

@Repository
public interface Studrepo extends JpaRepository<Student, Integer>{

	
	
}
