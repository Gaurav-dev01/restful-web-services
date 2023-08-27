package com.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	private UserDaoService service;

	public UserResource(UserDaoService service) {
		this.service = service;
	}

//	To get or retrieve all users: GET/users
	@GetMapping("/users")
	public List<User> retrieveAllUsers() {

		return service.findAll();

	}

//	To get one user by id: GET/users/{id}
	@GetMapping("/users/{id}")
	public User retrieveOneUser(@PathVariable int id) {

		return service.findById(id);

	}

//	To create a new user: POST/users

	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		service.save(user);
		
		return ResponseEntity.created(null).build();

	}
}
