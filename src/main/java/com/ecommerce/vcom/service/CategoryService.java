package com.ecommerce.vcom.service;

import com.ecommerce.vcom.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
}
