package speak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class Speak {

    @RequestMapping("/")
    public String giveMeTime() {
        Sentences english = new EnglishLanguage();
        return english.hello() + " " + english.greeting("Sophie") + " " + english.giveTime();
    }
    @RequestMapping("/jean")
    public String giveMeTimeJean() {
        Sentences english = new EnglishLanguage();
        return english.hello() + " Jean" ;
    }

    @RequestMapping("/en/{id}")
    public String giveMeTimeEN() {
        Sentences english = new EnglishLanguage();
        return english.hello() + " " + english.greeting("Sophie") + " " + english.giveTime();
    }

    @RequestMapping("/fr/{id}")
    public String giveMeTimeFR() {
        Sentences french = new FrenchLanguage();
        return french.hello() + " " + french.greeting("Sophie") + " " + french.giveTime();
    }

    public static void main(String args[]){

        SpringApplication.run(Speak.class, args);

    }


}
