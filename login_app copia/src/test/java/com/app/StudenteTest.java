/*package com.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.Entity.Studente;

@SpringBootTest
class StudenteTest {

    private Studente studente;

    @BeforeEach
    public void setup() {
        studente = new Studente();
        studente.setEmail("test@example.com");
        studente.setPassword("password123");
        studente.setNome("Mario");
        studente.setCognome("Rossi");
        studente.setIndirizzo("Bachelor");
        studente.setID("000");
    }

    @Test
    public void testGetEmail() {
        Assertions.assertEquals("test@example.com", studente.getEmail());
    }

    @Test
    public void testSetEmail() {
        studente.setEmail("newemail@example.com");
        Assertions.assertEquals("newemail@example.com", studente.getEmail());
    }

    @Test
    public void testGetPassword() {
        Assertions.assertEquals("password123", studente.getPassword());
    }

    @Test
    public void testSetPassword() {
        studente.setPassword("newpassword");
        Assertions.assertEquals("newpassword",studente.getPassword());
    }

    @Test
    public void testGetNome() {
        Assertions.assertEquals("Mario", studente.getNome());
    }

    @Test
    public void testSetNome() {
        studente.setNome("Luigi");
        Assertions.assertEquals("Luigi", studente.getNome());
    }

    @Test
    public void testGetCognome() {
        Assertions.assertEquals("Rossi", studente.getCognome());
    }

    @Test
    public void testSetCognome() {
        studente.setCognome("Verdi");
        Assertions.assertEquals("Verdi", studente.getCognome());
    }

    @Test
    public void testGetIndirizzo() {
        Assertions.assertEquals("Bachelor", studente.getIndirizzo());
    }

    @Test
    public void testSetIndirizzo() {
        studente.setIndirizzo("Master");
        Assertions.assertEquals("Master", studente.getIndirizzo());
    }
    
    @Test
    public void testGetID() {
        Assertions.assertEquals("000", studente.getID());
    }

    @Test
    public void testSetID() {
        studente.setID("111");
        Assertions.assertEquals("111", studente.getID());
    }
}*/