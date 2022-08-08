package in.sunera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.sunera.entity.Student;

@Controller
public class WelcomeController {

	
//	@RequestMapping("home")
//	public String welcome(HttpServletRequest req,HttpSession session) {
//		System.out.println("HI");
//		String name=req.getParameter("name");
//		session.setAttribute("name", name);
//		return "home";
//	}
	
//	@RequestMapping("home")
//	public String welcome(String name,HttpSession session) {
//		System.out.println("HI");
//		session.setAttribute("name", name);
//		return "home";
//	}
	
//	@RequestMapping("home")
//	public ModelAndView welcome(@RequestParam("name")String myName){
//		
//		ModelAndView mav=new ModelAndView();
//		mav.addObject("name",myName);
//		mav.setViewName("home");
//		return mav;
//	}
	
	
	@RequestMapping("home")
	public ModelAndView welcome(Student student){
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("Obj",student);
		mav.setViewName("home");
		return mav;
	}
}
