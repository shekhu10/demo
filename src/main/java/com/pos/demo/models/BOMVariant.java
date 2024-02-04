package com.pos.demo.models;
import java.util.List;

// Represents a Bill of Materials variant.
class BOMVariant {

    // Identifier to uniquely identify materials across branch, channels. // Required
    private String variantId;

    // Indicates the quantity of product that is produced using the given quantity of materials. // Required
    private double bomYield;

    // Stores where this configuration is applicable. // Required
    private List<String> stores;

    // Channels where this configuration is applicable. Allowed only if trackingMethod is Non Stocked. // Required
    private List<String> channels;

    // Configure materials part of this variant. // Required
    private List<MaterialConfig> materials;

    // Comments added for each field.

    // You can add constructor, getters, and setters as needed based on your requirements.
}
