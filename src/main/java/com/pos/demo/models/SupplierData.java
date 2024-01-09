package com.pos.demo.models;

import java.util.List;

public class SupplierData {
    private String supplierType;
//    Type of Supplier
    private String supplierCode;
    private String supplierName;
    private String sourceStoreCode;
//    Store Code of the Managed By Store
    private String taxId;
//    Tax Identification Number
    private Address address;
    private List<String> buyerStoreCodes;
//    Store Codes of the Buyer Stores - Buyer Store Codes
    private String contactName;
//    Contact Name of Supplier
    private String title;
//    Title of the contact person
    private String phoneNumber;
//    Phone Number of Supplier
    private String email;
    private String taxStateCode;
//    state code of supplier to support GST
    private String terms;
//    terms and conditions
    private boolean skipPOApproval;
//    Applicable for external supplier, this flag bypasses approve functionality for PO and price override for GRN items.
    private boolean postGRNwithAttach;
//    If true, attachment required before submitting the GRN
    private boolean isNegotiable;
//    Indicates if the price is negotiable. Only if true, allow override of price in PO/GRN
    private boolean ignoreInvoiceNumber;
//    Indicates if the supplier invoice number’s validation can be skipped in GRN.
    private String description;


}
