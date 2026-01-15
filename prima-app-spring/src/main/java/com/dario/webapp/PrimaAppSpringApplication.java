package com.dario.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimaAppSpringApplication {

	public static void main(String[] args) {
		System.out.println("Ciao Dario");
		SpringApplication.run(PrimaAppSpringApplication.class, args);
	}

}
