package com.ofs.my_first_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SpringBootApplication is an annotation that
 * can start your application by running on 
 * an inbuilt server - default port : 8080
 */

@SpringBootApplication
public class MyFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstAppApplication.class, args);
	}

}
