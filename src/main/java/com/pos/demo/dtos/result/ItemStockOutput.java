package com.pos.demo.dtos.result;

// Represents output for an item's current stock.
public class ItemStockOutput {

    // Item Sku. // Required
    private String sku;

    // Current present quantity of that sku. // Required
    private double itemQty;
}
