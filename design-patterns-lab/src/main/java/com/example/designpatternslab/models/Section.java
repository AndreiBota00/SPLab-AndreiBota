package com.example.designpatternslab.models;

import java.util.ArrayList;
import java.util.List;

public class Section extends Element {
    private String title;
    private List<Element> elements = new ArrayList<Element>();

    public Section(String title) {
        this.title = title;
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
    public void print() {
        System.out.println(title);
        for (Element element : elements) {
            element.print();
        }
    }
}
