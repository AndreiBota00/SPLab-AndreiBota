package com.example.designpatternslab.models;

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
