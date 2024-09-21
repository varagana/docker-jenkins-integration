package com.example.jenkins_docker_int;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
	@GetMapping
	public String greet() {
		return "hello";
	}

}
