package com.jio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bugsnag.Bugsnag;

@SpringBootApplication
public class SimpleCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleCrudApplication.class, args);
		System.out.println("Application Start");
		
	}

}
