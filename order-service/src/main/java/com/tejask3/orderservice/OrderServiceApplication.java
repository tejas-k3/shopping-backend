package com.tejask3.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderServiceApplication {

//	FOR SOME REASON data.sql is not getting executed so created db manually post which app ran successfully!
	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
