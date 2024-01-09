package com.pos.demo.models;

import com.pos.demo.models.enums.ItemType;

import java.util.List;

public class ItemActivity {
    // SKU Code of the item
    String skuCode;

    // Name of the item
    String itemName;

    // Type of Item. Enum: [ Product, Material, Supplies ]
    ItemType itemType;

    // Unit of measure for the item
    String measuringUnit;

    // Category Names to which the item is associated.
    String categoryName;

    // Opening Balance of the item on a given day
    double openingBalance;

    // Value of Inventory at opening
    double openingCost;

    // Closing Balance of the item on a given day
    double closingBalance;

    // Value of Inventory at closing
    double closingCost;

    // The ISO times at which this item went out of stock on this day
    List<String> stockOutTimes;

    // Details of activities on this item
    List<ActivityDetails> activities;
}
