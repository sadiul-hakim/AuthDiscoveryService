package xyz.sadiulhakim.authdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AuthDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthDiscoveryServiceApplication.class, args);
	}

}
