package in.sunera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	/*@GetMapping("/getuser")
	public ModelAndView getUser() {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("uname", "Sunera Technologies..");
		mav.addObject("umail", "sunera@gmail.com");
		mav.addObject("phno", "+919988347876");
		
		mav.setViewName("index");
		
		return mav;*/
	
	@GetMapping("/user")
	public String getUser(Model model) {
		
		model.addAttribute("uname", "Sunera Technologies..");
		model.addAttribute("umail", "sunera@gmail.com");
		model.addAttribute("phno", "+919988347876");
		
		return "index";
	}
}
