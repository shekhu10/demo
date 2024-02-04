package com.pos.demo.models;
import java.util.List;

// Represents a Bill of Supplies variant.
class BOSVariant {

    // Identifier to uniquely identify materials across branch, channels. // Required
    private String variantId;

    // Stores where this configuration is applicable. // Required
    private List<String> stores;

    // Channels where this configuration is applicable. // Required
    private List<String> channels;

    // Configure materials part of this variant. // Required
    private List<MaterialConfig> materials;

}