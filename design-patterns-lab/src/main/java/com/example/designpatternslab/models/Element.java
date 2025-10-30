package com.example.designpatternslab.models;

abstract class Element {
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
