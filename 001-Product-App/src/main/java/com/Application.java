package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("apliication start");
		SpringApplication.run(Application.class, args);
		System.out.println("applictaion stop");
	}
	

}
