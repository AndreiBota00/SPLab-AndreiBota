package com.example.designpatternslab.commands;

import com.example.designpatternslab.models.Book;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetBooksCommand implements Command<List<Book>> {
    private final CommandContext context;

    public GetBooksCommand(CommandContext context) {
        this.context = context;
    }

    @Override
    public List<Book> execute() {
        return context.getBookRepository().findAll();
    }
}
