package in.sunera;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sunera.entity.Student;
import in.sunera.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepository repository = context.getBean(StudentRepository.class);
		
		System.out.println(repository.findById(101));
		
		//List<Integer> idsList=Arrays.asList(101,44,40);
		
	//List<Student> students=repository.findAllById(idsList);
		
		long count = repository.count();
 System.out.println(count);
	List<Student> students1=repository.findAll();
	
	for (Student student :students1) {
		System.out.println(student);
	}
	}
}
