package com.batutinhas.backloginfinito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BacklogInfinitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BacklogInfinitoApplication.class, args);
	}

}
