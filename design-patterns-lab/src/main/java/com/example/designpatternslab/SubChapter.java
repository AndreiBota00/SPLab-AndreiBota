package com.example.designpatternslab;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;

    private List<Paragraph> paragraphs =  new ArrayList<Paragraph>();
    private List<Image> images = new ArrayList<>();
    private List<Table> tables = new ArrayList<>();

    public SubChapter(String name){
        this.name = name;
    }

    public void addParagraph(Paragraph paragraph){
        paragraphs.add(paragraph);
    }

    public void addImage(Image image){
        images.add(image);
    }

    public void addTable(Table table){
        tables.add(table);
    }

    public void print(){
        System.out.println("SubChapter: " + name);
        for(Paragraph paragraph : paragraphs){ paragraph.print(); }
        for(Image image : images){ image.print(); }
        for(Table table : tables){ table.print(); }
    }

}
