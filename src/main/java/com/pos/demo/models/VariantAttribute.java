package com.pos.demo.models;

import java.util.List;

// Represents Variant Attributes for e.g., size, flavor. Present only if type = Group.
public class VariantAttribute {

    // Variant attribute type.
    private String description;

    // Name of the variant attribute. For e.g., Size.
    private String name;

    // Possible values for this variant attribute. For e.g., [Small, Medium].
    private List<String> values;
}
