package com.app.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Studenti")
public class Studente {
     @Id
	 private String Email;
     private String Password;
     private String Nome;
     private String Cognome;
     private String Indirizzo;
     private String ID;
   
     
     
     
    public Studente(String Nome,String Cognome,String Email,String Password,String Indirizzo,String ID) {
    	this.Nome=Nome;
    	this.Cognome=Cognome;
    	this.Indirizzo=Indirizzo;
    	this.ID=ID;
    	this.Email=Email;
    	this.Password=Password;
    
    	
    }
    public Studente(){}
    

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
     
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public String getIndirizzo() {
		return Indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	
     
}



