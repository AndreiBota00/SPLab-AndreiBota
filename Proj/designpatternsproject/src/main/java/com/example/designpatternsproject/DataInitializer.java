package com.example.designpatternsproject;

import com.example.designpatternsproject.model.CategoryType;
import com.example.designpatternsproject.model.Ingredient;
import com.example.designpatternsproject.model.MenuItem;
import com.example.designpatternsproject.model.Price;
import com.example.designpatternsproject.repository.MenuItemRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer {

    private final MenuItemRepository menuItemRepository;

    public DataInitializer(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }

    @PostConstruct
    public void init() {
        if (menuItemRepository.count() > 0) {
            return;
        }

        MenuItem pizza = new MenuItem();
        pizza.setName("Pizza Margherita");
        pizza.setCategoryType(CategoryType.MAIN_COURSE);
        pizza.setDescription("Classic Italian pizza");
        pizza.setQuantity(10);

        Price pizzaPrice = new Price();
        pizzaPrice.setPrice(35.0);
        pizzaPrice.setCurrency("RON");
        pizza.setPrice(pizzaPrice);

        pizza.setIngredients(List.of(
                new Ingredient("Cheese", true),
                new Ingredient("Tomato", false),
                new Ingredient("Basil", false)
        ));



        MenuItem cake = new MenuItem();
        cake.setName("Chocolate Cake");
        cake.setCategoryType(CategoryType.DESSERT);
        cake.setDescription("Chocolate dessert");
        cake.setQuantity(5);

        Price cakePrice = new Price();
        cakePrice.setPrice(22.0);
        cakePrice.setCurrency("RON");
        cake.setPrice(cakePrice);

        cake.setIngredients(List.of(
                new Ingredient("Chocolate", true),
                new Ingredient("Flour", true),
                new Ingredient("Eggs", true)
        ));


        MenuItem water = new MenuItem();
        water.setName("Sparkling Water");
        water.setCategoryType(CategoryType.DRINK);
        water.setDescription("Cold sparkling water");
        water.setQuantity(20);

        Price waterPrice = new Price();
        waterPrice.setPrice(8.0);
        waterPrice.setCurrency("RON");
        water.setPrice(waterPrice);

        water.setIngredients(List.of());


        menuItemRepository.saveAll(List.of(pizza, cake, water));

    }


}
