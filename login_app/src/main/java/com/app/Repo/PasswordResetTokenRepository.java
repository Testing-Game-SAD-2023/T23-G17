package com.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entity.PasswordResetToken;
import com.app.Entity.Studente;

@Repository
public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, String> {
    
    PasswordResetToken findByToken(String token);
    
    void deleteByStudente(Studente studente);
}