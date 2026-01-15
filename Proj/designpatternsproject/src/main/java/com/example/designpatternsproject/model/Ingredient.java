package com.example.designpatternsproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private boolean allergen;

    public Ingredient() {}

    public Ingredient(String name, boolean allergen) {
        this.name = name;
        this.allergen = allergen;
    }

    public Long getId() { return id; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isAllergen() {
        return allergen;
    }
    public void setAllergen(boolean allergen) {
        this.allergen = allergen;
    }
}
