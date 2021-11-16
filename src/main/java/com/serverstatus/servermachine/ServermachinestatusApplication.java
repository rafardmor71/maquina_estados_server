package com.serverstatus.servermachine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
public class ServermachinestatusApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServermachinestatusApplication.class, args);
	}

}
