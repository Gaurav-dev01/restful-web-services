package com.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

//	UserDaoService > Static List
	public static List<User> users = new ArrayList<User>();

	private static int userCount = 0;

	static {
		users.add(new User(++userCount, "Gaurav", LocalDate.now().minusYears(30)));
		users.add(new User(++userCount, "Neha", LocalDate.now().minusYears(25)));
		users.add(new User(++userCount, "Puja", LocalDate.now().minusYears(28)));
		users.add(new User(++userCount, "Sheetal", LocalDate.now().minusYears(27)));

	}
//	findAll	

	public List<User> findAll() {
		return users;
	}

//	Find One user by id
	public User findById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);

	}

//	Add new user
	public User save(User user) {
		user.setId(++userCount);
		users.add(user);

		return user;
	}

//	DELETE user by Id
	public void deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);

	}

}
