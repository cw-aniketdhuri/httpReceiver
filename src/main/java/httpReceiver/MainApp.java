package httpReceiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
	"httpReceiver",
	"httpReceiver.service",
	"httpReceiver.logic"
})
public class MainApp {

	public static void main(String[] args) {
		System.setProperty("java.security.auth.login.config", "jaas.config");
		SpringApplication.run(MainApp.class, args);
	}

}
