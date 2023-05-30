package com.dedication.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BankProjectApplication {

	
	
	@GetMapping("/")
	public ResponseEntity<String> home(){
		return new ResponseEntity<>("Home Page",HttpStatus.OK);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BankProjectApplication.class, args);
	}

}
