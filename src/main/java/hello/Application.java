package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        return "Hello Docker World! Today is " + localDate + " and the time is " + localTime;
    }

    public static void main(String[] args) {


        SpringApplication.run(Application.class, args);
    }
}
