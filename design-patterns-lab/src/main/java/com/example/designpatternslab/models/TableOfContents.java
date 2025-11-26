package com.example.designpatternslab.models;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(force = true)
public class TableOfContents extends Element {
    private String content;

    public TableOfContents(String content){
        this.content = content;
    }

    @Override
    public void print(){
        System.out.println(content);
    }
}
