package com.pipelinespring.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo1Application {
	
@GetMapping("/")
public String home() {
	return "welcome to springboot CI/CD deployment";
}


	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
