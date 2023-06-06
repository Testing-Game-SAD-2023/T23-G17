package com.app.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "password_reset_token")
public class PasswordResetToken {
    
    @Id
    private String idtoken;
    
    @Column(nullable = false)
    private String token;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "email", nullable = false)
    private Studente studente;
    
    @Column(nullable = false)
    private LocalDateTime expiryDate;
    
    public PasswordResetToken (String idtoken,String token,LocalDateTime expiryDate,Studente studente) {
    	this.idtoken=idtoken;
    	this.token=token;
    	this.studente=studente;
    	this.expiryDate=expiryDate;
    	
    }
    public PasswordResetToken(){}
    
    public String getidtoken() {
        return idtoken;
    }

    public void setidtoken(String idtoken) {
        this.idtoken = idtoken;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Studente getStudente() {
        return studente;
    }

    public void setStudente(Studente studente) {
        this.studente = studente;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDateTime localdatetime) {
        this.expiryDate = localdatetime;
    }
}
    
   
    

