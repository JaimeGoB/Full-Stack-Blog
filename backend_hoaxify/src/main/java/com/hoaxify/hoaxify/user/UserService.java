package com.hoaxify.hoaxify.user;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

//Create an instance of this class
@Service
public class UserService {
	
	UserRepository userRepository;

	//This will be used to encrypt(hash) password
	BCryptPasswordEncoder passwordEncoder;
	
	//Constructor injection - makes class easier to test
	public UserService(UserRepository userRepository) 
	{
		super();
		this.userRepository = userRepository;
		this.passwordEncoder = new BCryptPasswordEncoder();
	}
	
	public User save(User user)
	{
		//ENCRYPTING PASSWORD
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}
}


