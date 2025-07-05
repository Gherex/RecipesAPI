package com.gherex.recipeapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StepResponseDTO {

    private Long id;
    private Integer stepOrder;
    private String description;
}
