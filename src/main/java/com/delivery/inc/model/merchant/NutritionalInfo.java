package com.delivery.inc.model.merchant;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.List;

public class NutritionalInfo {
    private String description;
    private String calories;

    @Enumerated(EnumType.STRING)
    private List<Allergen> allergen;

    private List<String> additives;
    @Enumerated(EnumType.STRING)
    private List<SuitableDiet> suitableDiet;
    private boolean isAlcoholic;


}
