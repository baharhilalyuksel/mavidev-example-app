package com.example.mavidev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class MavidevApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavidevApplication.class, args);
	}

}
