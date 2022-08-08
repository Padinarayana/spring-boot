package in.sunera.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
		
	@GetMapping("/welcome1")
		public ResponseEntity<String> getwelcomeMsg() {
			String msg="welcome to sunera Tech...............GGGGGG";
			return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
}
