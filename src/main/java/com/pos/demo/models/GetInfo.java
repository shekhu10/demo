package com.pos.demo.models;

import com.pos.demo.models.enums.GetTypeDiscount;

public class GetInfo {
    // description: Details of Benefits of this discount

    // Type of discount - Percentage/Absolute Discount or get at Fixed Price.
    // Enum values: [ Percentage, Absolute, Value ]
    private GetTypeDiscount getType;

    // Applicable for getType = Percentage.
    private double percentageDiscount;

    // Applicable for getType = Absolute.
    private double absoluteDiscount;

    // Absolute Price of all get items together. Applicable for getType = Value.
    private double absoluteValue;

}
