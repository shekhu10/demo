package com.pos.demo.models;

// Represents the configuration of materials for a variant.
class MaterialConfig {

    // Sku code of the inventory item. // Required
    private String skuCode;

    // Measuring Unit Of the inventory item. // Required
    private String measuringUnit;

    // The quantity of material for one unit of the product. // Required
    private double quantity;

    // Consumption unit of this material.
    // This can be different from the measuring unit of the material and will consider a conversion factor.
    private String consumptionUnit;

    // The percentage of original material that is being useful. // Required
    private double materialYield;
}
