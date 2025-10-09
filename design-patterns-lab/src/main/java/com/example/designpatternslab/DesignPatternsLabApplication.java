package com.example.designpatternslab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsLabApplication {

    public static void main(String[] args) {

    Book book = new Book("Book1");
    book.addAuthor(new Author("Author1"));
    book.addAuthor(new Author("Author2"));

    Chapter chapter1 = book.addChapter("Chapter1");
    SubChapter subChapter1 = chapter1.addSubChapter("SubChapter1");

    subChapter1.addParagraph(new Paragraph("Paragraph1"));
    subChapter1.addImage(new Image("Image1"));
    subChapter1.addTable(new Table("Table1"));

    book.print();

    }

}
