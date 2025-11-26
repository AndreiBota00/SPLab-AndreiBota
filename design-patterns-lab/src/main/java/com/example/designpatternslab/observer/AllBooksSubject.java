package com.example.designpatternslab.observer;

import com.example.designpatternslab.models.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AllBooksSubject {
    private final List<Observer<Book>> observers = new ArrayList<>();

    public void attach(Observer<Book> observer) {
        observers.add(observer);
    }

    public void add(Book book) {
        notifyObservers(book);
    }

    private void notifyObservers(Book book) {
        for (Observer<Book> observer : observers) {
            observer.update(book);
        }
    }
}
