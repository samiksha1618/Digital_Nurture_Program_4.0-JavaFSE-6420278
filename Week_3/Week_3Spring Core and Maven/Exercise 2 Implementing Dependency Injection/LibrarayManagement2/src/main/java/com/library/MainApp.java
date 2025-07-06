package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring container from XML config
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get BookService bean from context
        BookService bookService = context.getBean("bookService", BookService.class);

        // Run method to verify DI
        bookService.displayBook();
    }
}
