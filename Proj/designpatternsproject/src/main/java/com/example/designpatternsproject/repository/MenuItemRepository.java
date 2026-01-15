package com.example.designpatternsproject.repository;

import com.example.designpatternsproject.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}
