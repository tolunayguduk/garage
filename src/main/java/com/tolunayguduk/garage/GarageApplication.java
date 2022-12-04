package com.tolunayguduk.garage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@SpringBootApplication(scanBasePackages = { "com.tolunayguduk.garage" })
public class GarageApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarageApplication.class, args);
	}

}
