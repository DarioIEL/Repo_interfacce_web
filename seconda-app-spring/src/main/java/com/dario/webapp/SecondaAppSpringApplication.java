package com.dario.webapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dario.webapp.dao.StudenteDAO;
import com.dario.webapp.entity.Studente;

@SpringBootApplication
public class SecondaAppSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondaAppSpringApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudenteDAO studenteDAO) {
		return runner -> {
			creaStudente(studenteDAO);
		};
	}
	
	
	private void creaStudente(StudenteDAO studenteDAO) {
		System.out.println("Creo lo studente");
		Studente nuovoStud = new Studente("Dario", "Mennillo", "dario@email.com");
		
		System.out.println("Salvo lo studente");
		studenteDAO.save(nuovoStud);
	}
}
