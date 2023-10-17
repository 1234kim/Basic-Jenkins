package com.example.Ebstack.Ebstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EbstackApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbstackApplication.class, args);
	}

}
