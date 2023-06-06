package com.app;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.PasswordResetToken;
import com.app.Entity.Studente;
import com.app.Repo.PasswordResetTokenRepository;

@Service
public class PasswordResetTokenService {

    private static final int TOKEN_EXPIRATION_HOURS = 24;

    @Autowired
    private PasswordResetTokenRepository tokenRepository;

    public PasswordResetToken createToken(Studente studente) {
        String tokenValue = generateToken();
        LocalDateTime expiryDate = LocalDateTime.now().plusHours(TOKEN_EXPIRATION_HOURS);
        String tokenv = UUID.randomUUID().toString().replace("-", "");
        

        PasswordResetToken token = new PasswordResetToken(tokenv,tokenValue,expiryDate,studente);
       /* token.setToken(tokenValue);
        token.setStudente(studente);
        token.setExpiryDate(expiryDate);*/

        return tokenRepository.save(token);
    }

    public PasswordResetToken getTokenByValue(String token) {
        return tokenRepository.findByToken(token);
    }

    public void deleteTokensByStudent(Studente studente) {
        tokenRepository.deleteByStudente(studente);
    }

    private String generateToken() {
        // Implement your token generation logic here
        // This can be a random string or a UUID
        
        // Example: Generate a random string token
        String token = UUID.randomUUID().toString().replace("-", "");
        return token;
    }
}