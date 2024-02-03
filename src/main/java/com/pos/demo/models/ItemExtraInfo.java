package com.pos.demo.models;

import com.pos.demo.models.enums.BoneProperty;
import com.pos.demo.models.enums.GravyProperty;
import com.pos.demo.models.enums.SpiceLevel;
import com.pos.demo.models.enums.SweetLevel;

import java.util.List;

// Represents extra information about this item. Present only for type = Simple/Variant.
public class ItemExtraInfo {

    // Number of people the item serves.
    private int serves;

    // Preparation time in minutes.
    private int preparationTime;

    // Portion Size.
    private String portionSize;

    // Unit of Measurement for portion size.
    private String portionSizeUnit;

    // Item allergy information.
    private List<String> allergyInformation;

    // Calories count in Kilo Calories.
    private int calorieCount;

    // Amount of sugar in grams.
    private double sugar;

    // Amount of carbohydrates in grams.
    private double carbohydrate;

    // Amount of Protein in grams.
    private double protein;

    // Amount of lipid in grams.
    private double lipid;

    // Amount of sodium in mg.
    private double sodium;

    // Amount of Fat in grams.
    private double totalFat;

    // Amount of monounsaturated in grams.
    private double monounsaturated;

    // Amount of polyunsaturated in grams.
    private double polyunsaturated;

    // Amount of saturated in grams.
    private double saturated;

    // Amount of transFat in grams.
    private double transFat;

    // Amount of cholesterol in mg.
    private double cholesterol;

    // Amount of fiber in grams.
    private double fiber;

    // Amount of polydextrose in grams.
    private double polydextrose;

    // Amount of polyols in grams.
    private double polyols;

    // Amount of caffeine in grams.
    private double caffeine;

    // Amount of artificial sweetener in grams.
    private double artificialSweetener;

    // Amount of monosodium glutamate in grams.
    private double msg;

    // Star Ingredients.
    private String starIngredients;

    // Main Ingredients.
    private String mainIngredients;

    // Primary Health Benefits.
    private String primaryHealthBenefits;

    // Secondary Health Benefits.
    private String secondaryHealthBenefits;

    // Lifestyle Diet Information.
    private String lifestyleDietInfo;

    // Dish Preparation Style.
    private String dishPreparationStyle;

    // List of up to 5 minerals and their amount.
    private List<MineralInfo> minerals;

    // List of up to 5 vitamins and their amount.
    private List<VitaminInfo> vitamins;

    // Spice Level.
    // Enum values: [ NONSPICY, MEDIUMSPICY, VERYSPICY, NOT_APPLICABLE ]
    private SpiceLevel spiceLevel;

    // Sweet Level.
    // Enum values: [ HIGH, MEDIUM, LOW, NOT_APPLICABLE ]
    private SweetLevel sweetLevel;

    // Bone Property.
    // Enum values: [ WITHBONE, BONELESS, NOT_APPLICABLE ]
    private BoneProperty boneProperty;

    // Gravy Property.
    // Enum values: [ DRY, GRAVY, NOT_APPLICABLE ]
    private GravyProperty gravyProperty;

    // List of comma-separated ingredients present.
    private String accompaniments;

    // Manufacturing Details.
    private String manufacturingDetails;

    // Storage Information.
    private String storageInformation;

    // true if contains seasonal ingredients.
    private boolean isHavingSeasonalIngredients;
}
