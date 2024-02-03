package com.pos.demo.models;

import com.pos.demo.models.enums.DiscountMode;
import com.pos.demo.models.enums.DiscountType;

import java.util.List;

public class Discount {
    // Unique identifier for this discount.
    private String discountId;

    // Unique discount code.
    private String discountCode;

    // Discount description.
    private String description;

    // Discount type among the enumerated values.
    // Enum values: [ Absolute, Percentage, BuyXGetY, BuyXGetX, BuyX ]
    private DiscountType discountType;

    // Discount mode. Auto - applies to all customers. Coupon - applicable only if valid coupon code is presented.
    // Enum values: [ Auto, Coupon ]
    private DiscountMode mode;

    // Optional start date in YYYY-MM-DD format.
    private String startDate;

    // Optional end date in YYYY-MM-DD format.
    private String endDate;

    // Dates on which this discount is not applicable.
    // Date in YYYY-MM-DD format
    private List<String> excludedDates;

    // Business hours during which this discount is applicable.
    private BusinessHours discountHours;

    // Memberships for which this discount is applicable. If not specified, applicable to all.
    private List<String> membershipIds;

    // Applicable for discountType of BuyXGetY, BuyXGetX, BuyX types.
    // Max number of times this can be applied in an order.
    private int limitInOrder;

    // Minimum order amount to qualify for this discount.
    private double minOrderAmount;

    // Categories this deal is applicable. Only categoryIds/itemIds have to be mentioned.
    private List<String> categoryIds;

    // Items this deal is applicable. Only categoryIds/itemIds have to be mentioned.
    private List<String> itemIds;

    // Applicable for discountType of Absolute, Percentage.
    // Discount value or percentage.
    private double discountRate;

    // Applicable for discountType = Percentage.
    // Limit on value after applying percentage.
    private double maxDiscountAmount;


}
