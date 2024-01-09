package com.pos.demo.models;

import com.pos.demo.models.enums.ActivityType;

// Details of activities on the item
public class ActivityDetails {
    // Activity type. Enum: [ Sales, Returns, Voided, Audit, Adjustment, Shrinkage, Purchase, Transfer In, Transfer Out, Housemade, House-Consumed ]
    ActivityType type;

    // Quantity of activity
    double quantity;

    // Cost of activity
    double cost;
}
