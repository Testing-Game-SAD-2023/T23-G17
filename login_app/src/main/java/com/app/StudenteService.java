package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.Studente;
import com.app.Repo.StudenteRepo;

import jakarta.persistence.EntityNotFoundException;
@Service
public class StudenteService {
	
	@Autowired
    private StudenteRepo studentRepository;
    
    public Studente updateStudentPassword(String email, String newPassword) {
        Studente studente = studentRepository.findById(email)
                .orElseThrow(() -> new EntityNotFoundException("Student not found"));

        studente.setPassword(newPassword);
        return studentRepository.save(studente);
    }

}
