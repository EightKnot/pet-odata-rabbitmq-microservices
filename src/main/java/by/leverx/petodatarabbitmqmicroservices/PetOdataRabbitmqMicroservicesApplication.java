package by.leverx.petodatarabbitmqmicroservices;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class PetOdataRabbitmqMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetOdataRabbitmqMicroservicesApplication.class, args);
	}

}
