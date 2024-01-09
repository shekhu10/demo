package com.pos.demo.models;

import com.pos.demo.models.enums.TaxType;

public class SupplierTaxDetails {
    // Supplier Tax Name
    String name;

    // Tax Percentage
    double percentage;

    // Type of Tax.
    // Enum: [ INTRA_STATE, INTER_STATE ]
    TaxType taxType;
}
