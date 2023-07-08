/*package com.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDateTime;

import com.app.Entity.PasswordResetToken;
import com.app.Entity.Studente;


@SpringBootTest
class TokenTests {

    private PasswordResetToken token;
    LocalDateTime myDateTime = LocalDateTime.now();

    @BeforeEach
    public void setup() {
        token = new PasswordResetToken();
        token.setidtoken("1L");
        token.setToken("abc123");
        token.setExpiryDate(myDateTime);
        token.setStudente(new Studente("Mario","Rossi","esempio0@gmail.com","Random00*","master","000"));
    }

    @Test
    public void testGetidtoken() {
        Assertions.assertEquals("1L", token.getidtoken());
    }

    @Test
    public void testSetidtoken() {
        token.setidtoken("2L");
        Assertions.assertEquals("2L", token.getidtoken());
    }

    @Test
    public void testGetToken() {
        Assertions.assertEquals("abc123", token.getToken());
    }

    @Test
    public void testSetToken() {
        token.setToken("xyz456");
        Assertions.assertEquals("xyz456", token.getToken());
    }

    @Test
    public void testGetExpiryDate() {
        Assertions.assertEquals(myDateTime, token.getExpiryDate());
    }

    @Test
    public void testSetExpiryDate() {
        token.setExpiryDate(myDateTime);
        Assertions.assertEquals(myDateTime, token.getExpiryDate());
    }

    @Test
    public void testGetStudente() {
        Assertions.assertEquals("esempio0@gmail.com", token.getStudente().getEmail());
    }

    @Test
    public void testSetStudente() {
        Studente newStudente = new Studente("Luigi","Verdi","esempio1@gmail.com","Random01*","bachelor","111");
        token.setStudente(newStudente);
        Assertions.assertEquals("esempio1@gmail.com", token.getStudente().getEmail());
    }
}*/