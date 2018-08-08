package hello;

import org.springframework.web.bind.annotation.RestController;

import hello.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    //Dependency - you don't want this. No new keyword
	//private HelloService service = new HelloService();
	// Instead Inject service here
	@Autowired // Spring create service and Auto wire injected it here
	private HelloService service; //spring dependency injection
	//Auto wiring: Spring create a bean 
	

    @RequestMapping("/")
    public String index() {
   
         return service.retrieveWelcomeMessage();
    	//return "Greetings from Spring Boott!";
    }

}
//You want Spring to manage this bean and create an instance of this
// Spring has component and use below annotation
//@Component //or user @Service
//class HelloService {
//	//spring manage this bean
//	public String retrieveWelcomeMessage() {
//		
//		 return "Greetings from Spring Boot - Welcome Service - with component and auto wiring";
//	}
//	
//}
