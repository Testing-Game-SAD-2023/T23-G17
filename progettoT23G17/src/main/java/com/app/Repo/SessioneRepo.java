package com.app.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entity.Sessione;
import com.app.Entity.Studente;


@Repository
public interface SessioneRepo extends JpaRepository <Sessione, String> {

	Optional<Sessione> findById(String id_sessione);
	


	//void deleteByStudente(String id);
	
}
