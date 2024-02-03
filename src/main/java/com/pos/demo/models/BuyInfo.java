package com.pos.demo.models;

import java.util.List;

public class BuyInfo {
    // description: Buy conditions to avail this discount

    // Categories this deal is applicable. Only categoryIds/itemIds have to be mentioned. refers to categories/categoryId
    private List<String> categoryIds;

    // Items this deal is applicable. Only categoryIds/itemIds have to be mentioned. refers to items/itemIds
    private List<String> itemIds;

    // Minimum quantity to buy to get this discount benefit.
    private int buyQty;
}
