package in.sunera.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import in.sunera.Entity.Student;
import in.sunera.Repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
     StudentRepository repo;
	
	@GetMapping("/getform")
	public  ModelAndView getform() {
ModelAndView mav=new ModelAndView();
mav.setViewName("home");
		
		return mav;
	}
	
	@GetMapping("/addStudent")
	public  ModelAndView addStudent(Student student) {
//		Student student=new Student();
		repo.save(student);
		ModelAndView mav1=new ModelAndView();
		String msg="successfully saved.";
		mav1.addObject("msg", msg);
		mav1.setViewName("success");
		return mav1;
	}
	
	@GetMapping("/getStudent")
	public  ModelAndView getStudent(int sid) {

		System.out.println(sid);
		Optional<Student> s=repo.findById(sid);
//		System.out.println(s);
		
		System.out.println(repo.findBySname("raja"));
		ModelAndView mav2=new ModelAndView();
		mav2.addObject("student", s);
		mav2.setViewName("showStudent");
		return mav2;
	}
	
	
	
	}
}
