package com.pos.demo.dtos.inputs;
import java.util.List;

// Represents input for retrieving current item stock.
public class ItemStockInput {

    // Store code for which you want current item stock. // Required
    private String branchCode;

    // Item’s sku codes you want the current stock for. // Required
    private List<String> skuCodes;
}