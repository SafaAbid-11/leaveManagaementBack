package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SpringbootBackend2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackend2Application.class, args);
	}

}
