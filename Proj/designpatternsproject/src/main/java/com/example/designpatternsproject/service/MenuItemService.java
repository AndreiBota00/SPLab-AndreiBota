package com.example.designpatternsproject.service;

import com.example.designpatternsproject.model.MenuItem;
import com.example.designpatternsproject.repository.MenuItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemService {
    private final MenuItemRepository menuItemRepository;

    public MenuItemService(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }

    public MenuItem add(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    public List<MenuItem> getAll() {
        return menuItemRepository.findAll();
    }

    public MenuItem getById(Long id) {
        return menuItemRepository.findById(id).orElse(null);
    }

    public MenuItem update(Long id, MenuItem menuItem) {
        MenuItem existingMenuItem = menuItemRepository.findById(id).orElseThrow(() -> new RuntimeException("menuItem not found"));

        existingMenuItem.setName(menuItem.getName());
        existingMenuItem.setCategoryType(menuItem.getCategoryType());
        existingMenuItem.setDescription(menuItem.getDescription());
        existingMenuItem.setPrice(menuItem.getPrice());
        existingMenuItem.setQuantity(menuItem.getQuantity());
        existingMenuItem.setIngredients(menuItem.getIngredients());

        return menuItemRepository.save(existingMenuItem);
    }

    public void delete(Long id) {
        menuItemRepository.deleteById(id);
    }
}
