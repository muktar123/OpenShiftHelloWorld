package Testing.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenShiftHelloWorldApplication {

	public static void main(String[] args) {
		System.out.println("Hello World..");
		SpringApplication.run(OpenShiftHelloWorldApplication.class, args);
	}

}
