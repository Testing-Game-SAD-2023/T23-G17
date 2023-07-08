package com.app;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.Studente;
import com.app.Repo.StudenteRepo;

@Service
public class StudenteService {

    @Autowired
    private StudenteRepo studentRepository;

    public Studente updateStudentPassword(String email, String newPassword) throws EntityNotFoundException {
        Studente studente = studentRepository.findById(email)
                .orElseThrow(() -> new EntityNotFoundException("Student not found"));

        studente.setPassword(newPassword);
        return studentRepository.save(studente);
    }
}
