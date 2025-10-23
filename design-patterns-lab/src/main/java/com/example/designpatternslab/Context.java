package com.example.designpatternslab;

public class Context {
    private int lineWidth;

    public Context(){
        this(30);
    }

    public Context(int lineWidth) {
        this.lineWidth = lineWidth;
    }

    public int getLineWidth() {
        return lineWidth;
    }
}
