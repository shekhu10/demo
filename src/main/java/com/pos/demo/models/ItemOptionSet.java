package com.pos.demo.models;

import java.util.List;

public class ItemOptionSet {
    // Unique name of the option set. e.g., Item Toppings.
    private String name;

    // Display name of the option set. e.g., Toppings.
    private String label;

    // Minimum required options for this set.
    private int min;

    // Maximum options allowed for this set.
    private int max;

    // Options in this set.
    private List<ItemOptionSetOption> options;
}
