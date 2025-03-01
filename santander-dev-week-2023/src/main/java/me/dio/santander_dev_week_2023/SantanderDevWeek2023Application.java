package me.dio.santander_dev_week_2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default server URL")})
@SpringBootApplication
public class SantanderDevWeek2023Application {

	public static void main(String[] args) {
		SpringApplication.run(SantanderDevWeek2023Application.class, args);
	}

}
