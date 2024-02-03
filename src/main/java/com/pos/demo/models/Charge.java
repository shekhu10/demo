package com.pos.demo.models;

import com.pos.demo.models.enums.ApplicableModes;
import com.pos.demo.models.enums.ChargeApplyAt;
import com.pos.demo.models.enums.ChargeType;

import java.util.List;

public class Charge {
    // Unique identifier for this charge.
    private String chargeId;

    // Charge name.
    private String name;

    // Indicated if to be applied at Item or Order level.
    // Enum values: [ Item, Order ]
    private ChargeApplyAt applyAt;

    // Indicates what type of orders this charge is applicable.
    // Enum values: [ Pickup, Delivery, Others ]
    private List<ApplicableModes> applicableModes;

    // Applicable only if applyAt=Order, minimum order amount beyond which this charge is waived.
    private double minOrderAmount;

    // Charge type.
    // Enum values: [ Absolute, Percentage ]
    private ChargeType chargeType;

    // Absolute/Percent value based on chargeType.
    private double chargeRate;

    // Taxes applicable on this charge. Refers to taxTypes/taxTypeId.
    private List<String> taxTypeIds;

    // true indicates chargeRate includes tax, otherwise taxes are extra.
    private boolean isIncludesTax;

    // HSN code for this charge.
    private String chargeTaxCode;
}
