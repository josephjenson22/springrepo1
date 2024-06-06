package quest.sbhiber.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import quest.sbhiber.entity.Student;
import quest.sbhiber.service.Studservice;

@RestController
public class Controller1 {

	@Autowired
	Studservice stser;
	@PostMapping("/save")
		public Student save(@RequestBody Student st) {
		return stser.savestud(st);
	}
	
	@GetMapping("/view")
	public List<Student> getallstud(){
		return stser.getallstud();
			}
	
	@PostMapping("/update")
	public Student updatStudent(@RequestBody Student st) {
		return stser.savestud(st);
	}
	
	@GetMapping("/findById/{id}")
	public Student findById(@PathVariable("id")  int id) {
		return stser.findById(id);
	}
	
	@PostMapping("/delete/{id}")
	public void deletebyId(@PathVariable("id") int id) {
		 stser.deletebyId(id);
	}
}
