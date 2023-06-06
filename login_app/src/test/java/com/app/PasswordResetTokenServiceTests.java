package com.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.app.Repo.PasswordResetTokenRepository;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import com.app.Entity.PasswordResetToken;
import com.app.Entity.Studente;
public class PasswordResetTokenServiceTests {

    @Mock
    private PasswordResetTokenRepository tokenRepository;

    @InjectMocks
    private PasswordResetTokenService tokenService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateToken() {
        Studente studente = new Studente();
        String tokenValue = "abc123";
        LocalDateTime expiryDate = LocalDateTime.now().plusHours(24);
        String tokenv = UUID.randomUUID().toString().replace("-", "");

        PasswordResetToken expectedToken = new PasswordResetToken(tokenv, tokenValue, expiryDate, studente);

        when(tokenRepository.save(any(PasswordResetToken.class))).thenReturn(expectedToken);

        PasswordResetToken createdToken = tokenService.createToken(studente);

        verify(tokenRepository, times(1)).save(any(PasswordResetToken.class));
        assertEquals(expectedToken, createdToken);
    }

    @Test
    public void testGetTokenByValue() {
        String tokenValue = "abc123";
        PasswordResetToken expectedToken = new PasswordResetToken("123", tokenValue, LocalDateTime.now(), new Studente());

        when(tokenRepository.findByToken(tokenValue)).thenReturn(expectedToken);

        PasswordResetToken retrievedToken = tokenService.getTokenByValue(tokenValue);

        assertEquals(expectedToken, retrievedToken);
    }

    @Test
    public void testDeleteTokensByStudent() {
        Studente studente = new Studente();
        
        tokenService.deleteTokensByStudent(studente);
        
        verify(tokenRepository, times(1)).deleteByStudente(studente);
    }
}