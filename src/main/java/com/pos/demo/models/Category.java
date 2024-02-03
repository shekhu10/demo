package com.pos.demo.models;

public class Category {
    // Unique identifier for this category.
    private String categoryId;

    // Category Name.
    private String name;

    // Display order of this category.
    private int displayOrder;

    // Category image URL.
    private String imageURL;

    // Sub-categories within this category.
    private SubCategory[] subCategories;
}
