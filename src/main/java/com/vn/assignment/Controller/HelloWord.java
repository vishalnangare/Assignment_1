package com.vn.assignment.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
	@GetMapping("/greetapi/v1/hello")
	public String greet ()
	{
	
		return "Hello World!!";
		
	}
	@GetMapping("greetapi/v2/hello")
	public String greet(@RequestParam String name)
	{
		return "Hello "+name;
	}

}
