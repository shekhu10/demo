package com.pos.demo.models;

public class Option {

    // Unique identifier for this option.
    private String optionId;

    // Reference to items/itemId of type = Simple/Variant/Option.
    private String itemId;

    // Display name of the option.
    private String optionName;

    // true, indicates to be selected by default.
    private boolean isDefault;

    // Display order of this option within the optionSet.
    private int displayOrder;

    // Maximum number of times this option can be picked. Default to 1.
    private int max;

    // Price for this option.
    private double price;
}
