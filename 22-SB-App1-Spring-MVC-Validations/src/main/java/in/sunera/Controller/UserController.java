package in.sunera.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import in.sunera.entity.User;
import in.sunera.repository.UserRepository;

@Controller
public class UserController {
	
	int c=1;
	
	@Autowired
	UserRepository userRepo;

	@GetMapping("/user")
	public String loadForm( ) {
		return "userReg";
	}
	
	@PostMapping("/saveUser")
	public ModelAndView saveuser(User user) {
		
		ModelAndView mav1=new ModelAndView();
		System.out.println(user);
		
		System.out.println(user.getPhno());
		if((String.valueOf(user.getPhno()).length()==10) && (user.getEmail().contains("@gmail.com"))
				           &&(user.getPassword().length()>8)) {
	userRepo.save(user);
		}
		else
			c=0;
		if(c==0) {
		mav1.addObject("user", user);
		mav1.setViewName("InvalidDetails");
		}
		else
		{
			mav1.addObject("user", user);
			mav1.setViewName("userRegSuccess");
		}
		return mav1;
	}
	
	
	@GetMapping("/findUser")
	@ResponseBody
	public List<User> findByname() {
		
		System.out.println( userRepo.findByusername("adinarayana1"));
		return userRepo.findByuseridGreaterThan(4);
	
	}
}

