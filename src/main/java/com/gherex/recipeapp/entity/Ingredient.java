package com.gherex.recipeapp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ingredient")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(length = 50)
    private String name;

}
