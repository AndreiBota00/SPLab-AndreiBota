package com.example.designpatternslab.models;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor(force = true)
public class Book extends Element{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Author> authors =  new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
}
