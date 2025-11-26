package com.example.designpatternslab.models;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(force = true)
public class BookTable extends Element{
    private String title;

    public BookTable(String title) {
        this.title = title;
    }

    @Override
    public void print(){
        System.out.println(title);
    }
}
