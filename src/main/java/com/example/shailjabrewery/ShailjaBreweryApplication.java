package com.example.shailjabrewery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class ShailjaBreweryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShailjaBreweryApplication.class, args);
	}

}
