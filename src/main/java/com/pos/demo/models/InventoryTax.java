package com.pos.demo.models;

// Represents Tax Definition.
public class InventoryTax {

    // Tax Name. // Required
    private String taxName;

    // Tax percentage. // Required
    private double percentage;

    // Amount on which tax to be applied
    private double taxableAmount;

    // Tax Amount. // Required
    private double taxAmount;
}
