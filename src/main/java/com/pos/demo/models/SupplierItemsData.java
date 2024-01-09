package com.pos.demo.models;

import com.pos.demo.models.enums.TaxApplicableOn;

import java.util.List;

public class SupplierItemsData {
    // Supplier Code
    String supplierCode;

    // Supplier Item Name. Is unique within a given supplier.
    String name;

    // Item unit of measure. e.g. each, kg etc.
    String measuringUnit;

    // Supplier Item’s SKU Code
    String skuCode;

    // Inventory SKU Code of the Supplier Item
    String inventorySKUCode;

    // Category Names to which the item is associated
    String categoryName;

    // Supplier Item’s Bar Code
    String barCode;

    // Indicates if fractional quantity is allowed in an activity
    boolean allowFraction;

    // True indicates the price includes tax
    boolean isIncludesTax;

    // MRP of the item
    double mrp;

    // Margin Percentage is applied on MRP to derive at the price
    double marginPercentage;

    // Indicates tax is applicable on which field - Buying Price, Top Of MRP, MRP(Reverse computed)
    // Enum: [ BUYING_PRICE, TOP_OF_MRP, MRP_REVERSE_COMPUTED ]
    TaxApplicableOn taxApplicableOn;

    // Enum: [ BUYING_PRICE, TOP_OF_MRP, MRP_REVERSE_COMPUTED ]
    // Supplier Tax Details.
    List<SupplierTaxDetails> taxDetails;
}
