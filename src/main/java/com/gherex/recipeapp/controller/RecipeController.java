package com.gherex.recipeapp.controller;

import com.gherex.recipeapp.dto.RecipeRequestDTO;
import com.gherex.recipeapp.dto.RecipeResponseDTO;
import com.gherex.recipeapp.service.RecipeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/recipes")
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;

    @GetMapping
    public List<RecipeResponseDTO> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @GetMapping("/{id}")
    public RecipeResponseDTO getRecipeById(@PathVariable Long id) {
        return recipeService.getRecipeById(id);
    }

    @PostMapping
    public RecipeResponseDTO postRecipe(@RequestBody @Valid RecipeRequestDTO recipeDTO) {
        return recipeService.createRecipe(recipeDTO);
    }

    @PutMapping("/{id}")
    public RecipeResponseDTO putRecipe(@PathVariable Long id, @RequestBody @Valid RecipeRequestDTO recipeDTO) {
        return recipeService.updateRecipe(id, recipeDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable Long id) {
        recipeService.deleteRecipe(id);
    }
}

