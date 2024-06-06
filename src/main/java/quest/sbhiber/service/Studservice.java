package quest.sbhiber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quest.sbhiber.entity.Student;
import quest.sbhiber.repos.Studrepo;

@Service
public class Studservice {

	@Autowired
	Studrepo srepo;
	
	public Student savestud(Student stud) {
		return srepo.save(stud);
	}
	
	public List<Student> getallstud(){
		return srepo.findAll();
	}
	public Student findById(int id) {
		return srepo.findById(id).get();
	}
	public void  deletebyId(int id) {
		srepo.deleteById( id);
	}
}
