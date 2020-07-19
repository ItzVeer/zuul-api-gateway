package com.gateway.demo.docterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DocterServiceApplication {

	@GetMapping("/get")
	public String msg(){
		return "Doctor is here to help you.";
	}

	public static void main(String[] args) {
		SpringApplication.run(DocterServiceApplication.class, args);
	}

}
