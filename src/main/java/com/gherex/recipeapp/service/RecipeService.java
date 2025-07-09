package com.gherex.recipeapp.service;

import com.gherex.recipeapp.dto.RecipeRequestDTO;
import com.gherex.recipeapp.dto.RecipeResponseDTO;
import jakarta.validation.Valid;

import java.util.List;

public interface RecipeService {
    RecipeResponseDTO createRecipe(@Valid RecipeRequestDTO recipeDTO);

    RecipeResponseDTO getRecipeById(Long id);

    List<RecipeResponseDTO> getAllRecipes();

    RecipeResponseDTO updateRecipe(Long id, @Valid RecipeRequestDTO recipeDTO);

    void deleteRecipe(Long id);
}
