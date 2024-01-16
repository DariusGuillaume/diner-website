package com.dg.lukes_diner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class LukesDinerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LukesDinerApplication.class, args);
	}

}
