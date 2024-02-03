package com.pos.demo.models;

import java.util.List;

public class OptionSet {
    // Unique identifier for this optionSet.
    private String optionSetId;

    // OptionSet name.
    private String name;

    // If present, use this for display instead of name.
    private String displayName;

    // OptionSet description.
    private String description;

    // Minimum number of options to be included.
    private int min;

    // Maximum number of options allowed.
    private int max;

    // List of options within this optionSet.
    private List<Option> options;

}
