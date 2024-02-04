package com.pos.demo.dtos.inputs;

import com.pos.demo.models.InventoryItem;

import java.util.List;

// Represents Create or Update Inventory Items Input. Note: Product is limited to updates only.
public class InventoryItemInput {

    // List of items to be created or updated.
    private List<InventoryItem> items;

}
