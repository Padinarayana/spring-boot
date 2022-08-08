package in.sunera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sunera.binding.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
