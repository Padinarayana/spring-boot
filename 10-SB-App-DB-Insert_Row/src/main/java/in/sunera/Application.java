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
		
		StudentRepository repo=context.getBean(StudentRepository.class);
//		Student s1=new Student(1114,"raja","raja@gmail.com",9099499494L);
//		Student s2=new Student(1115,"rani","rani@gmail.com",4523237876L);
		
//		System.out.println(repo.findById(1111));
//		
//		List<Integer> list=Arrays.asList(1111,1112,1113);
//		
//		List<Student> data=repo.findAllById(list);
//		
//		for (Student datas:data) {
//			System.out.println(datas);
//		}
////		
//		List<Student> list=Arrays.asList(s1,s2);
//		repo.saveAll(list);
		
//		  List<Student> list=new ArrayList<Student>(); list.add(s1); list.add(s2); for
//		  (Student lists: list) { repo.save(lists); } repo.save(s1);
//		  System.out.println("Record Inserted..");
		 
//		 
//		System.out.println("Is Record Present::"+repo.existsById(1116));
//		System.out.println("count::"+repo.count());
		
//		List<Student> students =repo.findAll();
		
//		List<Student> students=repo.findAll(Sort.by("sid").descending());
//		for (Student student:students) {
//			System.out.println(student);
//		}
		
//		int pageNo = 1;
//		Page<Student> pageable = repo.findAll(PageRequest.of(pageNo-1, 3));
//		List<Student> students = pageable.getContent();
//		
//		for (Student s : students) {
//			System.out.println(s);
//		}
//		context.close();
		
		//List<Student> students=repo.findBySnameIn(Arrays.asList("raja","rani"));
		
		List<Student> students=repo.getSname(1111);
		for (Student student1:students) {
		System.out.println(student1);
		}
	}

}

