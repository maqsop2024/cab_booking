package com.cab_booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication(scanBasePackages = "com.cab_booking")
@EnableDiscoveryClient
@EntityScan(basePackages = "com.cab_booking.entity")
@EnableJpaRepositories(basePackages = "com.cab_booking.repository")
public class CabBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabBookingApplication.class, args);
		System.err.println("cab booking service up on port number 9191");
	}

}
