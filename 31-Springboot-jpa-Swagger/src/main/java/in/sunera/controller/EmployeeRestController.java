package in.sunera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sunera.Model.Employee;
import in.sunera.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1")
public class EmployeeRestController {

	@Autowired
	EmployeeRepository repo;
	
	@GetMapping("/employees")
       public List<Employee>  getAllEmployees(){
    	   return repo.findAll();
       }
	
	@PostMapping("/save")
	public String saveUser(@RequestBody Employee employee) {
//		Employee emp=new Employee("rani","P","rani@gmail.com");
		repo.save(employee);
		return "Saved";
	}
	
}
