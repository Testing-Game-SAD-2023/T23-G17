package com.app.Repo;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entity.Studente;

@Repository
public interface StudenteRepo extends JpaRepository<Studente,String> 
{

	Optional<Studente> findById(String email);
	
  

}
