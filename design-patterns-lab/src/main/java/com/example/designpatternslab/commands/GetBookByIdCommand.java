package com.example.designpatternslab.commands;

import com.example.designpatternslab.models.Book;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GetBookByIdCommand implements CommandWithInput<Long, Optional<Book>> {

    private final CommandContext context;

    public GetBookByIdCommand(CommandContext context) {
        this.context = context;
    }

    @Override
    public Optional<Book> execute(Long id) {
        return context.getBookRepository().findById(id);
    }

}
