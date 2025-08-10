package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		LOGGER.info("START");

		SpringApplication.run(SpringLearnApplication.class, args);

		displayCountry(); // 🔥 This is what loads the country.xml and prints

		LOGGER.info("END");
	}

	public static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country = context.getBean("country", Country.class);

		// TEMPORARY CHECK
		System.out.println("Country Loaded: " + country.getName() + " (" + country.getCode() + ")");
		LOGGER.debug("Country: {}", country);
	}
}
