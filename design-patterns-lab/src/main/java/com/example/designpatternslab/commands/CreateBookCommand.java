package com.example.designpatternslab.commands;

import com.example.designpatternslab.models.Book;
import org.springframework.stereotype.Component;

@Component
public class CreateBookCommand implements CommandWithInput<Book, Book> {
    private final CommandContext context;

    public CreateBookCommand(CommandContext context) {
        this.context = context;
    }

    @Override
    public Book execute(Book book) {
        return context.getBookRepository().save(book);
    }
}
