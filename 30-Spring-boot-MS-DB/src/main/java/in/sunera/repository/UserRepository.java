package in.sunera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.sunera.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
	public User findByuserName(String userName);
	
	@Query(value="select * from user_dtls1 where user_id=:userId", nativeQuery=true)
	public User findUserById(Integer userId);


}
