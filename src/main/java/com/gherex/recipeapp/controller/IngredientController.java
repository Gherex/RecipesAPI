package com.gherex.recipeapp.controller;

import com.gherex.recipeapp.dto.IngredientResponseDTO;
import com.gherex.recipeapp.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/ingredients")
@RequiredArgsConstructor
public class IngredientController {

    private final IngredientService ingredientService;

    public Set<IngredientResponseDTO> getAllIngredients() {
        return ingredientService.getAllIngredients();
    }

    @GetMapping("/{id}")
    public IngredientResponseDTO getIngredientById(@PathVariable Long id) {
        return ingredientService.getIngredientById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteIngredient(@PathVariable Long id) {
        ingredientService.deleteIngredient(id);
    }

}
