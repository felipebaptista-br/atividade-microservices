package com.gamefps.gamefps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.gamefps.gamefps.Controller"})
public class GamefpsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GamefpsApplication.class, args);
	}

}
