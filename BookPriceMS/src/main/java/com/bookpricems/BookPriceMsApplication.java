package com.bookpricems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookPriceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookPriceMsApplication.class, args);
	}

}
