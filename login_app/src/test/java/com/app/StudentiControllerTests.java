/*package com.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import com.app.Controller.StudentiController;
import com.app.Entity.Studente;
import com.app.Repo.PasswordResetTokenRepository;
import com.app.Repo.StudenteRepo;
import com.app.Entity.PasswordResetToken;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class StudentiControllerTest {

    @Mock
    private StudenteRepo studenteRepo;

    @Mock
    private PasswordResetTokenRepository tokenRepository;
    

    @Mock
    private EmailSenderService emailSenderService;

    @Mock
    private StudenteService studenteService;
    
    @Mock
    private PasswordResetTokenService tokenService;

    @Mock
    private Model model;

    @InjectMocks
    private StudentiController studentiController;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testLoginStudente_ValidCredentials() {
        // Arrange
        Studente studente = new Studente();
        studente.setEmail("test@example.com");
        studente.setPassword("password");

        Optional<Studente> studenteOptional = Optional.of(studente);
        when(studenteRepo.findById("test@example.com")).thenReturn(studenteOptional);

        // Act
        String result = studentiController.LoginStudente(studente, model);

        // Assert
        verify(model, times(3)).addAttribute(anyString(), any());
        assertEquals("home-login", result);
    }

    @Test
    void testLoginStudente_InvalidCredentials() {
        // Arrange
        Studente studente = new Studente();
        studente.setEmail("test@example.com");
        studente.setPassword("incorrect");

        when(studenteRepo.findById("test@example.com")).thenReturn(Optional.empty());

        // Act
        String result = studentiController.LoginStudente(studente, model);

        // Assert
        assertEquals("ErroreLogin", result);
    }

    @Test
    void testRegistraStudente_NewStudent() {
        // Arrange
        Studente studente = new Studente();
        studente.setEmail("test@example.com");

        when(studenteRepo.findById("test@example.com")).thenReturn(Optional.empty());
        when(studenteRepo.save(any(Studente.class))).thenReturn(new Studente());

        // Act
        String result = studentiController.RegistraStudente(studente, model);

        // Assert
        verify(studenteRepo, times(1)).findById("test@example.com");
        verify(studenteRepo, times(1)).save(any(Studente.class));
        verify(model, times(1)).addAttribute(eq("Studente"), any(Studente.class));
        assertEquals("Okreg", result);
    }

    @Test
    void testRegistraStudente_ExistingStudent() {
        // Arrange
        Studente studente = new Studente();
        studente.setEmail("test@example.com");

        when(studenteRepo.findById("test@example.com")).thenReturn(Optional.of(new Studente()));

        // Act
        String result = studentiController.RegistraStudente(studente, model);

        // Assert
        verify(studenteRepo, times(1)).findById("test@example.com");
        verify(studenteRepo, never()).save(any(Studente.class));
        assertEquals("errore", result);
    }
    
 

}
    */

