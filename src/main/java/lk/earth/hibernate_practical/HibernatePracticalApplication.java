package lk.earth.hibernate_practical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories
@SpringBootApplication
public class HibernatePracticalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernatePracticalApplication.class, args);
	}

}
