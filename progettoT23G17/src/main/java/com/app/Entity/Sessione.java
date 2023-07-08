package com.app.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sessioni")
public class Sessione {

   
    
    @Id
    private String id_sessione;
    
    
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "email", nullable = false)
    private Studente studente;
   
    
    
    
    public Sessione (String id_sessione,Studente studente) {
    	this.id_sessione=id_sessione;
    	this.studente=studente;
    	
    	
    	
    }
    public Sessione(){}
    
    
  
    
    
    public String getid_sessione() {
        return id_sessione;
    }

    public void setid_sessione(String id_sessione) {
        this.id_sessione=id_sessione;
    }
    public Studente getStudente() {
        return studente;
    }

    public void setStudente(Studente studente) {
        this.studente = studente;
    }
   
    
    
}
