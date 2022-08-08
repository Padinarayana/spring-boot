package in.sunera.RestController;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sunera.entity.User;
import in.sunera.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class UserRestController {

	private static final Logger logger = LoggerFactory.getLogger(UserRestController.class);

	@Autowired
	UserRepository userRepo;

	@Operation(summary = "For Getting all Users.", operationId = "one")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "user Found"),
			@ApiResponse(responseCode = "404", description = "user not Found") })
	@GetMapping(path = "/getUsers" ,produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<List<User>> getUsers() {
			
		return ResponseEntity.ok(userRepo.findAll());
		}

	@Operation(summary = "Getting Single user data.")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "user found"),
			@ApiResponse(responseCode = "404", description = "user not found.") })
	@GetMapping(path = "/getUser/{userid}", produces = { "application/xml" })
	public Optional<User> getUser(@PathVariable("userid") int userid) {
		logger.info("getting single user");
		return userRepo.findById(userid);

	}

	@Operation(summary = "For Saving the User")
	@ApiResponses(value = { @ApiResponse(responseCode = "201", description = "User Saved"),
			@ApiResponse(responseCode = "404", description = "User not Saved.") })
	@PostMapping(path = "/save", consumes = { "application/json", "application/xml" })
	public User saveUser(@RequestBody User user) {
		logger.info("Saving data in db");
		userRepo.save(user);
		return user;
	}

	@Operation(summary = "Deleting the User")
	@ApiResponses(value = { @ApiResponse(responseCode = "200",description = "User Deleted"),
	@ApiResponse(responseCode = "400",description = "User not Deleted")
	})
	@DeleteMapping("/deleteUser/{userid}")
	public ResponseEntity deleteUser(@PathVariable("userid") int userid) {
		logger.info("Deleting the  data in db");
		if(userRepo.findById(userid).isPresent()) {
			userRepo.deleteById(userid);
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("not Found"+userid);
	}

	@PutMapping("/updateUser/{userid}")
	public User updateUser(@PathVariable("userid") int userid, @RequestBody User user) {
		logger.info("Updating data in db");
		userRepo.save(user);
		return user;
		
	}

}
