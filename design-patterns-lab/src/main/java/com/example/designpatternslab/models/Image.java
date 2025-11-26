package com.example.designpatternslab.models;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(force = true)
public class Image extends Element{
    private String url;

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void print(){
        System.out.println(url);
    }
}
