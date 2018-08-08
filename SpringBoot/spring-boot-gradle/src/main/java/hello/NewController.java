package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NewController {

    @RequestMapping("/NewController")
    public String index() {
        return "Greetings from Spring Boott - new controller";
    }

}