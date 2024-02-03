package com.pos.demo.models;

import java.util.List;

public class ContractItemsData {

    // Contract Item Name. Is unique within a given contract.
    private String name;  // Contract Item Name

    // Item unit of measure. e.g. each, kg etc.
    private String measuringUnit;  // Item unit of measure

    // Contract Item’s SKU Code
    private String skuCode;  // Contract Item’s SKU Code

    // Status of Contract Item
    private String status;  // Status of Contract Item

    // Contract Code
    private String contractCode;  // Contract Code

    // Contract Name
    private String contractName;  // Contract Name

    // Supplier Code
    private String supplierCode;  // Supplier Code

    // Supplier Type
    private String supplierType;  // Supplier Type

    // Type of Item (e.g Product, Material)
    private String itemType;  // Type of Item

    // Category Names to which the item is associated
    private String categoryName;  // Category Names

    // Supplier Item’s Bar Code
    private String barCode;  // Supplier Item’s Bar Code

    // Indicates if fractional quantity is allowed in an activity
    private boolean allowFraction;  // Indicates if fractional quantity is allowed

    // True indicates the price includes tax
    private boolean isIncludesTax;  // True indicates the price includes tax

    // MRP of the item
    private double mrp;  // MRP of the item

    // Margin Percentage is applied on mrp to derive at the price
    private double marginPercentage;  // Margin Percentage applied on MRP

    // Indicates tax is applicable on which field - Buying Price, Top Of MRP, MRP(Reverse computed)
    // Enum: [ Buying Price, Top Of MRP, MRP ]
    private String taxApplicableOn;  // Indicates tax applicability

    // Supplier Tax Details
    private List<SupplierTaxDetails> taxDetails;  // Supplier Tax Details

    // Conversion factor from one unit of contract item to one unit of inventory item
    private double conversion;  // Conversion factor

    // True indicates tax will be excluded during PO/GRN calculation
    private boolean excludeTaxInCost;  // Indicates tax exclusion during PO/GRN calculation

    // True indicates to capture the Excise duty at PO/GRN
    private boolean captureAddExciseDuty;  // Capture Excise duty at PO/GRN

    // Tax collected at source
    private double tcsPercentage;  // Tax collected at source

    // Object contains the Standing Purchase Order Schedule Information
    private String standingPOSchedule;  // Standing Purchase Order Schedule Information



}
