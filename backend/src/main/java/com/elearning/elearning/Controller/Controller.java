package com.elearning.elearning.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import com.elearning.elearning.Repository.StudentRepository;
import com.elearning.elearning.Repository.TeacherRepo;
import com.elearning.elearning.Repository.UserRepository;
import com.elearning.elearning.models.Student;
import com.elearning.elearning.models.Teacher;
import com.elearning.elearning.models.User;
@CrossOrigin(origins = "http://localhost:3000")
@SpringBootApplication
@RequestMapping("/Api/v1")
@RestController
public class Controller {
	@Autowired
	StudentRepository stdrepo;
	@Autowired
	TeacherRepo trepo;
	@Autowired
	UserRepository urepo;
	@GetMapping("/students")
	public List<Student> getAll() {
		return stdrepo.findAll();
	}
	@PostMapping("/addstudent")
	public Object addStudent(@RequestBody Student st) {
		return stdrepo.save(st);
		
	}
	@PostMapping("/addteacher")
	public Object addTeacher(@RequestBody Teacher tch) {
		return trepo.save(tch);
		
	}
	@PostMapping("/adduser")
	public Object adduser(@RequestBody User user ){
		List<User> us=urepo.findByUsername(user.getUsername());
		if(us.size()==0){
			return urepo.save(user);
		}

		return "user exists";
	}
	@DeleteMapping("/deletestud/{id}")
	public String deletStud(@PathVariable int id){
   stdrepo.deleteById(id);
   return  "student with id: " +id+ "has been deleted";
	}
	@PutMapping("/updateStud/{id}")
		public Object updateStudent(@RequestBody Student  std, @PathVariable int id){
			Student st=stdrepo.findById(id).get();
			st.setFirstname(std.getFirstname());
			st.setLastname(std.getLastname());
			st.setAge(std.getAge());
			st.setDepartment(std.getDepartment());
			st.setGrade(std.getGrade());

			return stdrepo.save(st);
		}

	@PostMapping("/login")
	public Boolean login(@RequestBody User us ) {
		List<User> user=urepo.findByUsername(us.getUsername());
		if((user.size()==1) && user.get(0).getUsername().equals(us.getUsername())){
			return true;

		}
		return false;
	}
	
}

