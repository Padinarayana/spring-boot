package in.sunera.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.sunera.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	public List<Student> findBySname(String name);
	
	public List<Student> findBySnameIn(List<String> names);

 
	@Query(value = "select * From Student_dtls where sid=:sid",nativeQuery = true)
	public List<Student> getSname(Integer sid);
	
}
