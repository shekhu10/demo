package com.pos.demo.models;

import com.pos.demo.models.enums.CatalogItemType;
import com.pos.demo.models.enums.ItemNature;
import com.pos.demo.models.enums.ItemStatus;

import java.util.List;

public class CatalogItem {

    // Type of item.
    // Enum values: [ Simple, Group, Variant, Option ]
    private CatalogItemType type;

    // Unique identifier for this item.
    private String itemId;

    // Unique SKU for this item.
    private String skuCode;

    // Price of the item. Present only for type = Simple/Variant.
    private double price;

    // Price to be overridden for a schedule.
    private List<SchedulePriceOverride> schedulePrices;

    // Display order.
    private int displayOrder;

    // Item Name.
    private String itemName;

    // Description of item.
    private String description;

    // Unit of measurement.
    private String measuringUnit;

    // Charges applicable for this item. Reference to charges/chargeId.
    private List<String> chargeIds;

    // Taxes applicable for this item. Reference to taxTypes/taxTypeId.
    private List<String> taxTypeIds;

    // true indicates the price is inclusive of taxes.
    private boolean isPriceIncludesTax;

    // Discounts/deals not applicable for this item.
    private boolean denyDiscount;

    // Reference to categories/categoryId.
    private String categoryId;

    // Reference to categories/subcategories/subCategoryId.
    private String subCategoryId;

    // Tags applicable for this item. Reference to itemTags/itemTagId.
    private List<String> itemTagIds;

    // Schedules applicable for this item. Reference to schedules/scheduleId.
    private List<String> scheduleIds;

    // OptionSets available for this item. Reference to optionSets/optionSetId.
    private List<String> optionSetIds;

    // Item bar code.
    private String barCode;

    // Nature of item.
    // Enum values: [ Goods, Service ]
    private ItemNature itemNature;

    // Status of item.
    // Enum values: [ Active, Inactive ]
    private ItemStatus status;

    // HSN code for this item.
    private String itemTaxCode;

    // Variant Attributes for e.g., size, flavor. Present only if type = Group.
    private List<VariantAttribute> variantAttributes;

    // Values of variant attributes applicable only for type = Variant.
    private List<VariantValues> variantValues;

    // Reference to items/itemId of Group Item. Present only for type = Variant.
    private String groupItemId;

    private ItemExtraInfo extraInfo;

}
