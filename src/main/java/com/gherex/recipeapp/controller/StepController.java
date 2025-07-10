package com.gherex.recipeapp.controller;

import com.gherex.recipeapp.dto.StepResponseDTO;
import com.gherex.recipeapp.service.StepService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/steps")
public class StepController {

    private final StepService stepService;

    public List<StepResponseDTO> getAllSteps() {
        return stepService.getAllSteps();
    }

    @GetMapping("/{id}")
    public StepResponseDTO getStepById(@PathVariable Long id) {
        return stepService.getStepById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStep(@PathVariable Long id) {
        stepService.deleteStep(id);
    }

}
