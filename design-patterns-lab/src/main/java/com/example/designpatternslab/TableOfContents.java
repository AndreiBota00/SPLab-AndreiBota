package com.example.designpatternslab;

import javax.swing.*;

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
