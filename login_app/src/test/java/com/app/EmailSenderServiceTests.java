/*package com.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import static org.mockito.Mockito.*;

public class EmailSenderServiceTests {

    @Mock
    private JavaMailSender mailSender;

    @InjectMocks
    private EmailSenderService emailSenderService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSendSimpleEmail() {
        String toEmail = "test@example.com";
        String subject = "Test Subject";
        String body = "Test Body";

        emailSenderService.sendSimpleEmail(toEmail, body, subject);

        verify(mailSender, times(1)).send(any(SimpleMailMessage.class));
    }
}
*/