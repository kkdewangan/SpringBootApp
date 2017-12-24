package com.kamald.helloworld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class HelloController {

	@RequestMapping("/{name}")
	public String hello(@PathVariable String name) {
		return "Hello World !! Welcome " + name;
	}
	
}
