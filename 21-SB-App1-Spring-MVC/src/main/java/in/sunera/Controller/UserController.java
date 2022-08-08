package in.sunera.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import in.sunera.entity.User;
import in.sunera.repository.UserRepository;

@Controller
public class UserController  {
	
	@Autowired
	UserRepository userRepo=null;
	
	Logger logger=LoggerFactory.getLogger(UserController.class);

//	public UserController(UserRepository userRepo) {
//		this.userRepo=userRepo;
//	}

	@GetMapping("/user")
	public String loadForm( ) {
		
		logger.error("error happend");
		return "userReg";
	}
	
	@PostMapping("/saveUser")
	public ModelAndView saveuser(User user) {
		
		ModelAndView mav1=new ModelAndView();
		System.out.println(user);
	userRepo.save(user);
		mav1.addObject("user", user);
		mav1.setViewName("userRegsuccess");
		return mav1;
	}
	
	@GetMapping("/findUser")
	@ResponseBody
	public String findByname() {
		
//		System.out.println( userRepo.findByusername("adinarayana1"));
		return userRepo.findByusername("adinarayana1");
	
	}
//	
//	public String findByNameById(int userid) {
//		
//		if(userid<0) {
//			throw new IllegalArgumentException("Invalid details");
//		}
//		String str=userRepo.findNameById(userid);
//		return str;
//	}
}

