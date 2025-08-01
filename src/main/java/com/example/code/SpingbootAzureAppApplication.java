package com.example.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpingbootAzureAppApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "I love you siva HYD:)";
	}
	@GetMapping("/age")
	public String getMessageAge(){
		return "I love you siva HYD:) 19";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpingbootAzureAppApplication.class, args);
	}

}
