package studio.thinkground.aroundhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"studio.***"})
public class AroundHubSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AroundHubSpringBootApplication.class, args);
    }

}
