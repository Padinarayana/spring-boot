package in.sunera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sunera.entity.User;
import in.sunera.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		UserRepository userRepo = context.getBean(UserRepository.class);
		
		User user=new User(111,"raja","raja@email.com",12344422453l);
		
		User user1=new User(222,"rani","rani@gmail.com",34567893323l);
		
		List<User> list=Arrays.asList(user,user1);
		//System.out.println(userRepo.saveAll(list));
		
		System.out.println(userRepo.count());
		
		System.out.println(userRepo.findAll());
		
		System.out.println(userRepo.findById(111));
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(111);
		list1.add(222);
		list1.add(333);
		System.out.println(userRepo.findAllById(list1));
		
		System.out.println(userRepo.existsById(222));
		
		System.out.println(userRepo.findByuserName("raja"));
		
		
		System.out.println(userRepo.findUserById(111));
		
	}
	

}
