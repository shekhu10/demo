package com.pos.demo.models;

import com.pos.demo.models.enums.DiscountType;

import java.util.List;

public class Catalog {
    private List<CouponProvider> couponProviders;
    private List<TaxType> taxTypes;
    private List<Category> categories;

    // Tags that are associated to item
    private List<ItemTag> itemTags;

    // Shedule definitions to be used for items
    private List<Schedule> schedules;
    private List<Charge> charges;

    private List<RedemptionMembership> memberships;

    private List<Discount> discounts;

    private List<CatalogItem> items;

    private List<OptionSet> optionSets;

}
