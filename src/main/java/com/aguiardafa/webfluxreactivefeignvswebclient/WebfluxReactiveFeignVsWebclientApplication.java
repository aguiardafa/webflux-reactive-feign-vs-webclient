package com.aguiardafa.webfluxreactivefeignvswebclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactivefeign.spring.config.EnableReactiveFeignClients;

@EnableReactiveFeignClients
@SpringBootApplication
public class WebfluxReactiveFeignVsWebclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxReactiveFeignVsWebclientApplication.class, args);
	}

}
