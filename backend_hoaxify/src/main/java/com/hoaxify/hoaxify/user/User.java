package com.hoaxify.hoaxify.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {

	@Id			    //setting primary key
	@GeneratedValue //auto-generation is default (created unique ids)
	private long id;
	private String username;
	private String displayName;
	private String password;
}
