package security.googleauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class GoogleAuthApplication {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    public static void main(String[] args) {
        SpringApplication.run(GoogleAuthApplication.class, args);
    }

}
