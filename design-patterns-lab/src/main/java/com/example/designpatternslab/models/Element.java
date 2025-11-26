package com.example.designpatternslab.models;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor(force = true)
abstract class Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public abstract void print();

    public void add(Element element){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void remove(Element element){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Element get(int index){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
