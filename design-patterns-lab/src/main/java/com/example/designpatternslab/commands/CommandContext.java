package com.example.designpatternslab.commands;

import com.example.designpatternslab.persistence.BookRepository;
import org.springframework.stereotype.Component;

@Component
public class CommandContext {

    private final BookRepository bookRepository;

    public CommandContext(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }
}
