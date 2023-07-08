package com.app.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Repo.StudenteRepo;



	@Component
	public class Databaseinitlzr implements CommandLineRunner {

	    @Autowired
	    private StudenteRepo studentRepository;

	    @Override
	    public void run(String... args) throws Exception {
	        // Create and save student entities during initialization
	    	
	    	Studente studente= new Studente();
	        studente.setEmail("robaca@gmail.com");
	        studente.setNome("Roberta");
	        studente.setCognome("Acampora");
	        studente.setPassword("Random00*");
	        studente.setID("000");
	        studente.setIndirizzo("ing");
	        
	        studentRepository.save(studente);
	    }
	}
