package com.example.designpatternslab;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors = new ArrayList<Author>();
    private List<Chapter> chapters = new ArrayList<>();
    private TableOfContents tableOfContents = new TableOfContents();

    public Book(String title){
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public Chapter addChapter(String chapterName) {
        Chapter chapter = new Chapter(chapterName);
        chapters.add(chapter);
        return chapter;
    }

    public void print(){
        System.out.println("Book: " + title);
        for (Author author : authors){ author.print(); }
        tableOfContents.print();
        for (Chapter chapter : chapters){ chapter.print(); }
    }

}
