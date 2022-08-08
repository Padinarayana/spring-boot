package in.sunera.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sunera.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	List<User>  findByusername(String name);

	List<User> findByuseridGreaterThan(int userid);
	
}
