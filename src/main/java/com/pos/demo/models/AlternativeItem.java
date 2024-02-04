package com.pos.demo.models;

// Represents an alternative item.
class AlternativeItem {

    // Sku code of the alternative item. // Required
    private String skuCode;

    // Quantity of existing alternative item as compared to a single quantity of the new item. // Required
    private double conversion;
}
