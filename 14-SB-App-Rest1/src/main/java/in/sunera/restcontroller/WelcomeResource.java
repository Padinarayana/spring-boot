package in.sunera.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeResource {

	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeMsg(){
		String msg="Welcome to Sunera....";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/welcome1")
	public String welcomeMsg1() {
		String msg="welcome to Sunera..ssssdsafdfsdsfsd.";
		return msg;
		}
	}

