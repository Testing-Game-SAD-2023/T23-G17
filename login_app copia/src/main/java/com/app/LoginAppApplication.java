package com.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class LoginAppApplication {
	/*@Autowired
	private EmailSenderService service;*/

	public static void main(String[] args) {
		SpringApplication.run(LoginAppApplication.class, args);
		
		System.out.println("My application is running on");
	}
	
	/*@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() {
		
	}*/

}

    
	
