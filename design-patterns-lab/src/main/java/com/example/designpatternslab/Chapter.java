package com.example.designpatternslab;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters =  new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public SubChapter addSubChapter(String subChapterName){
        SubChapter subChapter = new SubChapter(subChapterName);
        subChapters.add(subChapter);
        return subChapter;
    }

    public void print(){
        System.out.println("Chapter " + name);
        for (SubChapter subChapter : subChapters) {
            subChapter.print();
        }
    }


}
