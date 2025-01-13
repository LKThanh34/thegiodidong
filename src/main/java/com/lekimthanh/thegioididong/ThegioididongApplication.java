package com.lekimthanh.thegioididong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
		org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
})
public class ThegioididongApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThegioididongApplication.class, args);
	}

}
