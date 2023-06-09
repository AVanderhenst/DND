package com.spring.dnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DndApplication {

	public static void main(String[] args) {
		SpringApplication.run(DndApplication.class, args);
		System.out.println("Hello, World!");
	}

}
