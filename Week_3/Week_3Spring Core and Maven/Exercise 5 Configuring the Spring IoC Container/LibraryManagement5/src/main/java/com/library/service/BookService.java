package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter for Spring to inject BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void bookServiceShow() {
        System.out.println("Inside BookService");
        bookRepository.bookRepoShow();
    }
}
