package com.example.designpatternsproject.controller;

import com.example.designpatternsproject.model.MenuItem;
import com.example.designpatternsproject.repository.MenuItemRepository;
import com.example.designpatternsproject.service.MenuItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuItemController {

    private final MenuItemService menuItemService;

    public MenuItemController(MenuItemService menuItemService) {
        this.menuItemService = menuItemService;
    }

    @PostMapping
    public MenuItem add(@RequestBody MenuItem menuItem) {
        return menuItemService.add(menuItem);
    }

    @GetMapping
    public List<MenuItem> getAll() {
        return menuItemService.getAll();
    }

    @GetMapping("/{id}")
    public MenuItem getById(@PathVariable Long id) {
        return menuItemService.getById(id);
    }

    @PutMapping("/{id}")
    public MenuItem update(@PathVariable Long id, @RequestBody MenuItem menuItem) {
        return menuItemService.update(id, menuItem);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        menuItemService.delete(id);
    }




}
