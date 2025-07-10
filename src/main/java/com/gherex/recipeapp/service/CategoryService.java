package com.gherex.recipeapp.service;

import com.gherex.recipeapp.dto.CategoryResponseDTO;
import com.gherex.recipeapp.entity.Category;

import java.util.Optional;
import java.util.Set;

public interface CategoryService {
    Set<CategoryResponseDTO> getAllCategories();

    CategoryResponseDTO getCategoryById(Long id);

    Optional<Category> findCategoryById(Long id);

    void deleteCategory(Long id);

}
