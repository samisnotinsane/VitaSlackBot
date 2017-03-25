package vitaslackbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sameen on 25/03/2017.
 */

@SpringBootApplication(scanBasePackages = {"me.ramswaroop.jbot", "vitaslackbot"})
public class ChatBotApp {

    public static void main(String[] args) {
        SpringApplication.run(ChatBotApp.class, args);
    }
}
