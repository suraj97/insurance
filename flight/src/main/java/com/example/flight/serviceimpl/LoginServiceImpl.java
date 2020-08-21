package com.example.flight.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flight.model.User;
import com.example.flight.repository.UserRepository;
import com.example.flight.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	UserRepository userRepository;

	public boolean validateUser(String username, String password) {
		System.out.println("Entering - LoginServiceImpl.validateUser(String, String) - username : "+username+" | password : "+password);
		boolean validUser = false;
		User user = userRepository.validateUser(username, password);
		if(user != null){
			validUser = true;
		}
		return validUser;
	}

	public User save(User user) {
		return userRepository.save(user);
	}

	public List<User> getAllUserDetails() {
		return userRepository.findAll();
	}

	public int deleteUserDetailsById(Long id) {
		return userRepository.deleteUserDetailsById(id);
	}
	

}
