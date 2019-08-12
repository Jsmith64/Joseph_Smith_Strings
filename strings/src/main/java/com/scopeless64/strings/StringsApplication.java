package com.scopeless64.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hello client! How are you doing?";
	}

	@RequestMapping("/random") 
	public String random()	{
		int rand = (int)(Math.random()*((3-0)+1));
		String[] nice = new String[4];
		nice[0] = "It's easy to learn!";
		nice[1] = "It's very fast!";
		nice[2] = "Random nice thing!";
		nice[3] = "Other random nice thing!";
		return "Spring Boot is great! " + nice[rand];
	}
	

}
