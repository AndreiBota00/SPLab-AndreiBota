package com.example.designpatternslab.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(force = true)
public class Section extends Element {
    private String title;

    @OneToMany(targetEntity = Element.class, cascade = CascadeType.ALL)
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
