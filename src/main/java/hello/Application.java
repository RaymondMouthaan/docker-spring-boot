package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;
import java.util.Properties;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        Map<String, String> env = System.getenv();
        Properties prop = System.getProperties();
        String hostName = "";

        try {
            hostName = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return "Hello Docker World! Today is " + localDate + " and the time is " + localTime + " Hostname " + hostName;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
