package site.techpryde.teamstack;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "site.techpryde.teamstack")

public class TeamstackServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeamstackServicesApplication.class, args);
	}
}
