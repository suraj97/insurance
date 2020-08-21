package com.example.flight.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.flight.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	@Query(value = "SELECT u FROM User u WHERE u.username = :username and u.password = :password ")
	public User validateUser(@Param("username") String username, @Param("password") String password);
	
	@Modifying
	@Transactional
	@Query(value="delete from User u where u.uid =:uid")
	public int deleteUserDetailsById(@Param("uid") Long uid);
}
