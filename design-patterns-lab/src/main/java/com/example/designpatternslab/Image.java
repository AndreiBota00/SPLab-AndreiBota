package com.example.designpatternslab;

public class Image {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public void print(){
        System.out.println("Image Name: " + imageName);
    }
}
