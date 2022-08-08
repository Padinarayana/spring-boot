package in.sunera.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.sunera.binding.Student;
import in.sunera.repository.StudentRepository;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;

	@GetMapping("/student")
	public String registerStudent(Model model) {
		Student studentObj=new Student();
		model.addAttribute("student", studentObj);
		return "index";
	}
	@PostMapping("/saveStudent")
	public String handleSBton(Student student, Model model ) {
		System.out.println(student);
	    studentRepository.save(student);
		return "success";
	}
}
