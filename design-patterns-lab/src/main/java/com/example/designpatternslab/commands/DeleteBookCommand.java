package com.example.designpatternslab.commands;

import org.springframework.stereotype.Component;

@Component
public class DeleteBookCommand implements CommandWithInput<Long, Boolean> {

    private final CommandContext context;

    public DeleteBookCommand(CommandContext context) {
        this.context = context;
    }

    @Override
    public Boolean execute(Long id) {
        if (context.getBookRepository().existsById(id)) {
            context.getBookRepository().deleteById(id);
            return true;
        }
        return false;
    }
}
