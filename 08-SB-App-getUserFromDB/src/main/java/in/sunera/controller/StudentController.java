package in.sunera.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.sunera.binding.Student;
import in.sunera.repository.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping("/getuser")
	public String getstudent(Model model) {
		Student studentObj=new Student();
		model.addAttribute("student", studentObj);
	    return "index";
	}
	
	public String getData(Student student,Model model) {
		studentRepository.findAllById(student.getSid());
		
	}
}
