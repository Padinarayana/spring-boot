package in.sunera.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sunera.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
