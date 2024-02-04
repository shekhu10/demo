package com.pos.demo.models;

import com.pos.demo.models.enums.ItemType;
import com.pos.demo.models.enums.TrackingMethod;
import com.pos.demo.models.enums.ValuationMethod;
import java.util.List;

// Represents an inventory item.
public class InventoryItem {

    // Type of inventory item you want to create or update. // Required
    private ItemType itemType;

    // Name of the item. // Required
    private String name;

    // Category of item which it belongs to. Should be existing in the business. // Required
    private String category;

    // Sub-category. Should be existing in the business.
    private String subCategory;

    // Measuring Unit Of the item. Should be defined in business settings. // Required
    private String measuringUnit;

    // Sku code of the Item. Should be unique. // Required
    private String skuCode;

    // Barcode of the item.
    private String barCode;

    // Stocking Method of the item, whether item is stocked or non-stocked. // Required
    private TrackingMethod trackingMethod;

    // Indicates if the item is configured for inventory tracking at the time of sale.
    // If not provided in input then by default considered true.
    private boolean trackInventory;

    // true/false value depending on whether the item is perishable or not. // Required
    private boolean perishable;

    // Number of days materials shelf life is. Only accepted if perishable is true.
    private int shelfLife;

    // Valuation method of the item. // Required
    private ValuationMethod valuationMethod;

    // Tax code of the item.
    private String taxCode;

    // Item Description.
    private String description;

    // Alternative Item for this item from existing Items.
    private List<AlternativeItem> altItem;

    // Bill of Materials. Allowed only if itemType is Materials/Product.
    private List<BOMVariant> bomVariants;

    // Bill of Supplies. Allowed only if itemType is Supplies/Product.
    private List<BOSVariant> bosVariants;

    // Comments added for each field.

    // You can add constructor, getters, and setters as needed based on your requirements.
}
