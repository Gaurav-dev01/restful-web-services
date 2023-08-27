package com.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	//@RequestMapping(method = RequestMethod.GET,path = "/hello-world")
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World.!";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World.!");
	}
	
//	Path Parameters
//	/hello-world/path-variable/{name}
//	/hello-world/path-variable/Gaurav
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPatVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World.!, %s", name));
	}
	
}
