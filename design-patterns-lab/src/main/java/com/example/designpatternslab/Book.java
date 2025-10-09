package com.example.designpatternslab;

import java.util.ArrayList;
import java.util.List;

public class Book extends Element{
    private String title;

    private List<Author> authors =  new ArrayList<>();
    private List<Element> elements = new ArrayList<>();

    public Book(String title){
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    @Override
    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void remove(Element element) {
        elements.remove(element);
    }

    @Override
    public Element get(int index){
        return elements.get(index);
    }

    @Override
    public void print(){
        System.out.println("Book: " + title);
        System.out.println("Authors: ");
        for(Author author : authors){
            author.print();
        }

        System.out.println("Contents: ");
        for(Element element : elements){
            element.print();
        }
    }
}
