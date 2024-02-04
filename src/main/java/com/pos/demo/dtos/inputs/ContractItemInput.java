package com.pos.demo.dtos.inputs;

import com.pos.demo.models.ContractItem;

import java.util.List;

public class ContractItemInput {
    public String contractCode; //contract code (required)

    //List of contract Items to be created (required)
    public List<ContractItem> contractItems;
}
