package com.abhijeet.blog.services;

import com.abhijeet.blog.domain.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> listCategories();
    Category createCategory(Category category);

}

