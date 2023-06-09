package com.tejask3.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}
	/*
	First need to make sure MongoDB instance is running
	C:\Users\TEJAS>net start MongoDB
	The MongoDB Server (MongoDB) service is starting.
	The MongoDB Server (MongoDB) service was started successfully.

	And stopping it once work is done!
	C:\Users\TEJAS>net stop MongoDB
	The MongoDB Server (MongoDB) service is stopping.
	The MongoDB Server (MongoDB) service was stopped successfully.
	 */
}
