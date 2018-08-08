package hello.service;
//You want Spring to manage this bean and create an instance of this
// Spring has component and use below annotation

import org.springframework.stereotype.Component;

@Component //or user @Service
public class HelloService {
	//spring manage this bean
	public String retrieveWelcomeMessage() {
		
		 return "Greetings from Spring Boot - Welcome Service - with component and auto wiring - service package";
	}
	
}