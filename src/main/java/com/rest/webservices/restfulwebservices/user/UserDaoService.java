package com.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
//	UserDaoService > Static List
	public static List<User> users = new ArrayList<User>();
	
	static {
		users.add(new User(1, "Gaurav", LocalDate.now().minusYears(30)));
		users.add(new User(2, "Neha", LocalDate.now().minusYears(25)));
		users.add(new User(3, "Puja", LocalDate.now().minusYears(28)));
		users.add(new User(4, "Sheetal", LocalDate.now().minusYears(27)));
		
	}
//	findAll	
	
//	save
	
//	findOne

}
