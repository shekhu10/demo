package com.pos.demo.dtos.inputs;

import com.pos.demo.models.enums.ContractStatus;

import java.util.List;

//Contract Input Model
public class ContractInput {

    // Contract name (required)
    public String contractName;

    // Status of the contract (required), using Enum for predefined values
    public ContractStatus status;

    // External Supplier Code (required)
    public String supplierCode;

    // Start Date of the contract (required)
    public String startDate;

    // End Date of the contract (required)
    public String endDate;

    // Terms of the contract
    public String contractTerms;

    // Contract Labels as defined in business preferences
    public List<String> contractLabels;

}