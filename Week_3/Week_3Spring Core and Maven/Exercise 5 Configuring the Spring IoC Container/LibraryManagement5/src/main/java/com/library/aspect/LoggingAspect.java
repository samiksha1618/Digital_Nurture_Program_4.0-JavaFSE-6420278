package com.library.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.library.service.BookService.bookServiceShow(..))")
    public void logBefore() {
        System.out.println("Hello World!");
    }
}
