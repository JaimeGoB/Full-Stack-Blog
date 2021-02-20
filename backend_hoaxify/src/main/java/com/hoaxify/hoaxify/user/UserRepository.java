package com.hoaxify.hoaxify.user;

import org.springframework.data.jpa.repository.JpaRepository;

/*
 * Jpa- comes with db query methods
 * We need to set the type of entity(user) and the second is pk (long)
 * */
public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
