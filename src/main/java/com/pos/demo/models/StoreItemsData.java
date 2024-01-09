package com.pos.demo.models;

import com.pos.demo.models.enums.ItemType;
import com.pos.demo.models.enums.StockStatus;
import com.pos.demo.models.enums.TrackingMethod;

public class StoreItemsData {
    // Type of Item. Enum: [ Product, Material, Supplies ]
    ItemType itemType;

    // Inventory Item’s SKU Code
    String skuCode;

    // Inventory Item’s Name
    String name;

    // Item unit of measure. e.g. each, kg etc.
    String measuringUnit;

    // Inventory Item’s quantity. Provided in response if branchCode is provided in input.
    String itemQty;

    // Code of the respective store. Provided in response if branchCode is provided in input.
    String branchCode;

    // Inventory Item’s Bar Code
    String barCode;

    // Valid values are Product/Materials representing Stocked/Non-Stocked items respectively.
    // Enum: [ Product, Materials ]
    TrackingMethod trackingMethod;

    // Category Names to which the item is associated.
    String categoryName;

    // Indicates if this is a perishable item.
    boolean perishable;

    // Shelf Life of the item in Days.
    int shelfLife;

    // Status of the stock e.g. IN_STOCK, OUT_OF_STOCK, LOW_STOCK.
    // Provided in response if branchCode is provided in input.
    // Enum: [ IN_STOCK, OUT_OF_STOCK, LOW_STOCK ]
    StockStatus stockStatus;

    // Average cost for each item. Provided in response if branchCode is provided in input.
    double averageCost;

    // Inventory Item Tax Code.
    String itemTaxCode;

}
