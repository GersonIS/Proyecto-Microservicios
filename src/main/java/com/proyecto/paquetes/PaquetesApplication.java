package com.proyecto.paquetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PaquetesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaquetesApplication.class, args);
	}

}
