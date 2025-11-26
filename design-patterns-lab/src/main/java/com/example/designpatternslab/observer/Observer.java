package com.example.designpatternslab.observer;

public interface Observer<T> {
    void update(T event);
}
