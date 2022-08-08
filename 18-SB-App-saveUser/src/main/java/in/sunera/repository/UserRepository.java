package in.sunera.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sunera.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
