package in.sunera.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.sunera.Entity.Student;

@RepositoryRestResource(collectionResourceRel = "students",path = "students")
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
}