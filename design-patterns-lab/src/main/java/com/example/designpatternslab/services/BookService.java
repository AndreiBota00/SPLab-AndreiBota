package com.example.designpatternslab.services;

import com.example.designpatternslab.models.Book;

import java.util.*;

public class BookService {
    private final Map<Long, Book> books = new HashMap<>();
    private long nextID = 1;

    public List<Book> getBooks() {
        return new ArrayList<>(books.values());
    }

    public Optional<Book> getBookById(long id) {
        return Optional.ofNullable(books.get(id));
    }

    public Book addBook(Book book) {
        books.put(nextID, book);
        nextID++;
        return book;
    }

    public Optional<Book> updateBook(Long id, Book updatedBook) {
        if (books.containsKey(id)) {
            books.put(id, updatedBook);
            return Optional.of(updatedBook);
        }
        return Optional.empty();
    }

    public boolean deleteBook(Long id) {
        return books.remove(id) != null;
    }
}
