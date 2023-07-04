package com.app.Controller;
import java.util.UUID;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.EmailSenderService;
import com.app.PasswordResetTokenService;
import com.app.StudenteService;
import com.app.Entity.PasswordResetToken;
import com.app.Entity.Studente;
import com.app.Repo.PasswordResetTokenRepository;
import com.app.Repo.StudenteRepo;




@Controller
public class StudentiController {
    @Autowired(required=true)
	private StudenteRepo studenterepo;
    
    @Autowired(required=true)
	private PasswordResetTokenRepository tokenrepo;
    
    
    @Autowired(required=true)
    private EmailSenderService service;
    
    @Autowired(required=true)
    private StudenteService servicestud;
    
    @Autowired(required=true)
    private PasswordResetTokenService tokenService;
    
    
    
     JdbcTemplate jdbctemplate;
	
	
	Studente studente;
	@GetMapping("/")
	public String login(Model model) {
		studente= new Studente();
		model.addAttribute("Studente",studente);
		return "login";
	}
	
	@RequestMapping("/registrazione")
	public String Registrazione(Model model) {
		model.addAttribute("Studente", new Studente());
		return "registrazione";
	}
	
	@RequestMapping("/recuperapassword")
    public String recuperapassword(Model model) {
	    model.addAttribute("Studente", new Studente());
		System.out.println("Password Dimenticata");
	    
   	    return "recuperapassword";
     }
	
	
	@PostMapping("/studenteLogin")
	public String LoginStudente(@ModelAttribute("studente") Studente studente,Model model) 
	{
		
		String Email=studente.getEmail();
		Optional <Studente> data= studenterepo.findById(Email);
		
		if(data.isPresent()==true) {
		if(studente.getPassword().equals(data.get().getPassword())) {
			String nome=data.get().getNome();
			String cognome=data.get().getCognome();
			String id=data.get().getID();
			model.addAttribute("nome",nome);
			model.addAttribute("cognome",cognome);
			model.addAttribute("id",id);
			return "home-login";
		}
		
		else {
			return "ErroreLogin";
		 }
		}
		else{
			return "ErroreLogin";
		 }
		}
	

	
	@PostMapping("/Registrastudente")
      public String RegistraStudente(@ModelAttribute("studente") Studente studente,Model model)
        {
           String Cognome=studente.getCognome();
           String Nome=studente.getNome();
           String Email =studente.getEmail();
           String Password=studente.getPassword();
           String Indirizzo=studente.getIndirizzo();
          
         
            
           
           System.out.println(Cognome);
           System.out.println(Nome);
           System.out.println(Email);
           System.out.println(Password);
           System.out.println(Indirizzo);
           
           
           
           Optional <Studente> data= studenterepo.findById(Email);
           if(data.isPresent()==true) { 
           
        	   return "errore";
           }
           else {
            
           String ID= UUID.randomUUID().toString();
           Studente data1 = new Studente(Nome,Cognome,Email,Password,Indirizzo,ID);
           studenterepo.save(data1);
           model.addAttribute("Studente", new Studente());
           return "Okreg";
           }
         }
	
	
		@PostMapping("/recoveryPassword")
		public String recoverypassword(@ModelAttribute("studente") Studente studente){
			
			
			
			String Email=studente.getEmail();
			
			Optional <Studente> data= studenterepo.findById(Email);
			
			if(data.isPresent()==true) {
				PasswordResetToken token = tokenService.createToken(studente);
				service.sendSimpleEmail(Email,"Ecco il token per cambiare la password   " + token.getToken(),"email");
				return "resettapassword";
			}else {
				
				return "ErroreLogin";
				
			}
			
		}
		
		@RequestMapping("/resettaPassword")
		public String resettapassword(@ModelAttribute("studente") Studente studente,Model model, @RequestParam("newPassword") String newPassword,@RequestParam("email") String email,@RequestParam("token") String token) 
		{
			
			 PasswordResetToken tokdata=tokenrepo.findByToken(token);
			 System.out.println("ciao");
			 
	           
			 	if(tokdata.getStudente().getEmail().equals(email)) {
			 		System.out.println(email);
			 		if(tokdata.getToken().equals(token)) {
	        		   servicestud.updateStudentPassword(email,newPassword);
	        		   System.out.println(newPassword);
	        		   tokenrepo.deleteById(tokdata.getidtoken());
	        		   return "okrecupera";
			 		}else {
			 			return "errore";
			 		}
			 		
	           }
	           else {
	            
	           return "ErroreLogin";
	           }
			
		 }
		
		
		

}