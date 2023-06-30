/*package com.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.app.Repo.StudenteRepo;

import jakarta.persistence.EntityNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import com.app.Entity.Studente;

public class StudenteServiceTests {

    @Mock
    private StudenteRepo studentRepository;

    @InjectMocks
    private StudenteService studentService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testUpdateStudentPassword() {
        String email = "test@example.com";
        String newPassword = "newPassword";

        Studente studente = new Studente();
        studente.setEmail(email);

        when(studentRepository.findById(email)).thenReturn(java.util.Optional.of(studente));
        when(studentRepository.save(studente)).thenReturn(studente);

        Studente updatedStudente = studentService.updateStudentPassword(email, newPassword);

        verify(studentRepository, times(1)).findById(email);
        verify(studentRepository, times(1)).save(studente);
        assertEquals(newPassword, updatedStudente.getPassword());
    }

    @Test
    public void testUpdateStudentPassword_StudentNotFound() {
        String email = "test@example.com";
        String newPassword = "newPassword";

        when(studentRepository.findById(email)).thenReturn(java.util.Optional.empty());

        assertThrows(EntityNotFoundException.class, () -> {
            studentService.updateStudentPassword(email, newPassword);
        });

        verify(studentRepository, times(1)).findById(email);
        verify(studentRepository, never()).save(any());
    }
}*/