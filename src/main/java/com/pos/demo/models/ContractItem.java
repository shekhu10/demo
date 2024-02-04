package com.pos.demo.models;

import java.util.List;

public class ContractItem {
    // Sku code of the Supplier Item. From which contract item to be created (required)
    public String skuCode;

    // true indicates the price includes tax.
    public boolean isIncludesTax;

    // true indicates the price of the item can be edited to 0 during GRN.
    public boolean eligibleForFree;

    // true indicates that tax will be calculated even if the effective price of the item is zero.
    public boolean taxIfFree;

    // MRP of the item.
    public double mrp;

    // Margin percentage applied on MRP to derive the price. mrp - (mrp * marginPercentage) cannot be less than or greater than price.
    public double marginPercentage;

    // Supplier’s price for each unit of this item.
    public double price;

    // Supplier Taxes (required)
    public List<String> taxes;

    // Indicates tax is applicable on which field - Buying Price, Top Of MRP, MRP(Reverse computed) (required)
    public String taxApplicableOn;

    // true indicates tax will be excluded during PO/GRN calculation.
    public boolean excludeTaxInCost;

    // true indicates to capture the Excise duty at PO/GRN
    public boolean captureAddExciseDuty;

    // Tax collected at source.
    public double tcsPercentage;

    // Object contains the Standing Purchase Order Schedule Information
    public StandingPOSchedule standingPOSchedule;

}