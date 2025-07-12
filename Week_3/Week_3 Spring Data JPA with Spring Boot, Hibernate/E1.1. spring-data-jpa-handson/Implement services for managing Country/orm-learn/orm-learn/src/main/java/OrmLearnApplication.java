package org.cognizant.ormlearn;

import com.cognizant.spring_learn.service.exception.CountryNotFoundException;
import org.cognizant.ormlearn.model.Country;
import org.cognizant.ormlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {

    private static CountryService countryService;
    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    public static void main(String[] args) throws CountryNotFoundException {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);

        getAllCountriesTest();
        testAddCountry();
    }

    private static void getAllCountriesTest() throws CountryNotFoundException {
        LOGGER.info("Start - getAllCountriesTest");
        Country country = countryService.findCountryByCode("IN");
        LOGGER.debug("Country: {}", country);
        LOGGER.info("End - getAllCountriesTest");
    }

    private static void testAddCountry() throws CountryNotFoundException {
        LOGGER.info("Start - testAddCountry");
        Country newCountry = new Country();
        newCountry.setCode("ZZ");
        newCountry.setName("Zootopia");

        countryService.addCountry(newCountry);

        Country result = countryService.findCountryByCode("ZZ");
        LOGGER.debug("Added Country: {}", result);
        LOGGER.info("End - testAddCountry");
    }
}

