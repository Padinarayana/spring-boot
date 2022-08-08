package in.sunera.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.sunera.Entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	public List<Student> findBySname(String name);
}