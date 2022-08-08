package in.sunera.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import in.sunera.entity.Student;

@RestController
public class UserController {
 
	
	@GetMapping("/get")
	public ModelAndView get(@RequestParam("name") String name,Student student ) {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("name",student);
		mav.setViewName("home");
		return mav;
	}
	
	
	@GetMapping("/getData/{sid}/{name}")
	public ModelAndView getData(@PathVariable("sid") int sid,@PathVariable("name") String name,Student student ) {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("name",student);
		mav.setViewName("home");
	    
		return mav;
	}
	
	
	@PostMapping("/getValues")
	public ModelAndView getData(Student student ) {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("name",student);
		mav.setViewName("home");
	    
		return mav;
	}
}
