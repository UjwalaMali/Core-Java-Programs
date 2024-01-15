package com.springhi10.springhi10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")
public class Springhi9Application {

	public static void main(String[] args) {
		SpringApplication.run(Springhi9Application.class, args);
	}

}
