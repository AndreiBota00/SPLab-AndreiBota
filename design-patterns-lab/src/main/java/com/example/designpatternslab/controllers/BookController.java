package com.example.designpatternslab.controllers;

import com.example.designpatternslab.commands.*;
import com.example.designpatternslab.models.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    private final CreateBookCommand createBookCommand;
    private final GetBooksCommand getBooksCommand;
    private final GetBookByIdCommand getBookByIdCommand;
    private final UpdateBookCommand updateBookCommand;
    private final DeleteBookCommand deleteBookCommand;

    public BookController(CreateBookCommand createBookCommand, GetBooksCommand getBooksCommand, GetBookByIdCommand getBookByIdCommand, UpdateBookCommand updateBookCommand, DeleteBookCommand deleteBookCommand) {
        this.createBookCommand = createBookCommand;
        this.getBooksCommand = getBooksCommand;
        this.getBookByIdCommand = getBookByIdCommand;
        this.updateBookCommand = updateBookCommand;
        this.deleteBookCommand = deleteBookCommand;
    }

    // GET /books
    @GetMapping
    public List<Book> getBooks() {

        return getBooksCommand.execute();
    }

    // GET /books/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Optional<Book> book = getBookByIdCommand.execute(id);
        return book.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    // POST /books
    @PostMapping
    public ResponseEntity<Long> addBook(@RequestBody Book book) {
        Book created = createBookCommand.execute(book);
        return ResponseEntity.created(URI.create("/books/" + created.getId())).body(created.getId());

    }

    // PUT /books/{id}
    @PutMapping("{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book) {
        Optional<Book> existing = getBookByIdCommand.execute(id);

        if (existing.isEmpty())
            return ResponseEntity.notFound().build();

        book.setId(id);
        Book updated = updateBookCommand.execute(book);
        return ResponseEntity.ok(updated);
    }

    // DELETE /books/{id}
    @DeleteMapping("{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable Long id) {
        boolean deleted = deleteBookCommand.execute(id);
        return deleted ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }


}
