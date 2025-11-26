package com.example.designpatternslab.commands;

public interface CommandWithInput<I, R> {
    R execute(I input);
}
