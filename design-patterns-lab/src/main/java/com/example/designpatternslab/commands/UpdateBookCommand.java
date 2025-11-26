package com.example.designpatternslab.commands;

import com.example.designpatternslab.models.Book;
import org.springframework.stereotype.Component;

@Component
public class UpdateBookCommand implements CommandWithInput<Book, Book>{

    private final CommandContext context;

    public UpdateBookCommand(CommandContext context) {
        this.context = context;
    }

    @Override
    public Book execute(Book updatedBook) {
        return context.getBookRepository().save(updatedBook);
    }
}
