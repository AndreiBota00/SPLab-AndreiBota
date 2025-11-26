package com.example.designpatternslab.observer;

import com.example.designpatternslab.models.Book;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;

public class SseObserver implements Observer<Book> {

    private final SseEmitter emitter;

    public SseObserver(SseEmitter emitter) {
        this.emitter = emitter;
    }

    @Override
    public void update(Book book) {
        try {
            String json = String.format("{\"id\": %d, \"title\": \"%s\"}",
                    book.getId(), book.getTitle());
            emitter.send(json);
        } catch (IOException e) {
            emitter.complete();
        }
    }
}
