package com.pos.demo.models;

public class ItemOptionSetOption {
    // description: Option definition.

    // Option identifier.
    private String id;

    // Name of the option. e.g., Cheese.
    private String name;

    // Display order within this option set.
    private int displayOrder;

    // SKU code of the option.
    private String skuCode;

    // Flag to indicate if this option is default.
    private boolean isDefault;

    // Option measuring unit.
    private String measuringUnit;

    // Option price.
    private String price;

    // Max allowed quantity of the option.
    private int max;

}
