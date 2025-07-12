package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    // Get the logger for this class
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.info("Application started successfully");   // Info message
        logger.error("Critical failure occurred in module X"); // Error message
        logger.warn("Configuration is using default values");  // Warning message
        logger.info("Application shutting down gracefully");   // Info message
    }
}
