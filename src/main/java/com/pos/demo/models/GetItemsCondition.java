package com.pos.demo.models;

import java.util.List;

public class GetItemsCondition {
    // Description of conditional on Get Items

    // Categories on which benefit is given. Refers to categories/categoryId.
    private List<String> categoryIds;

    // Items on which benefit is given. Refers to items/itemIds.
    private List<String> itemIds;

    // Number of items on which benefit is given.
    private int getQty;
}
