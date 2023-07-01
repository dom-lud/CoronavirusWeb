package com.example.coronavirusweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronavirusWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronavirusWebApplication.class, args);
	}

}
