package com.example.designpatternslab;

import com.example.designpatternslab.models.Author;
import com.example.designpatternslab.models.Book;
import com.example.designpatternslab.models.Paragraph;
import com.example.designpatternslab.models.Section;
import com.example.designpatternslab.persistence.BookRepository;
import jakarta.el.BeanNameResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DesignPatternsLabApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DesignPatternsLabApplication.class, args);

        BookRepository booksRepository = context.getBean(BookRepository.class);

        Author a1 = new Author("John", "Smith");
        Author a2 = new Author("Andrei", "Bota");

        Book book1 = new Book("Design Patterns");

        book1.addAuthor(a1);
        book1.addAuthor(a2);
        book1.add(new Paragraph("This is the intro paragraph!"));

        booksRepository.save(book1);

        Book book2 = new Book("Book 2");
        book2.addAuthor(new Author("John", "Doe"));

        Section section = new Section("Chapter 1");
        section.add(new Paragraph("This is a paragraph!"));
        book2.add(section);

        booksRepository.save(book2);

    }

}
