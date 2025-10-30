package com.example.designpatternslab.controllers;

import com.example.designpatternslab.models.*;
import com.example.designpatternslab.services.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // GET /books
    @GetMapping
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    // GET /books/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable long id) {
        return bookService.getBookById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    // POST /books
    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book newBook = bookService.addBook(book);
        return ResponseEntity.ok(newBook);
    }

    // PUT /books/{id}
    @PutMapping("{id}")
    public ResponseEntity<Book> updateBook(@PathVariable long id, @RequestBody Book book) {
        return bookService.updateBook(id, book).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    // DELETE /books/{id}
    @DeleteMapping("{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable long id) {
        boolean deleted = bookService.deleteBook(id);
        return deleted ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }


}
