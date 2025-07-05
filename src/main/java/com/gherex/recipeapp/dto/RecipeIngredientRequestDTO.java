package com.gherex.recipeapp.dto;

import com.gherex.recipeapp.enums.Unit;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RecipeIngredientRequestDTO {

    @NotNull
    private Long ingredientId;

    @NotNull
    @DecimalMin(value = "0.01", message = "La cantidad debe ser mayor que cero")
    private BigDecimal quantity;

    @NotNull
    private Unit unit;

}
