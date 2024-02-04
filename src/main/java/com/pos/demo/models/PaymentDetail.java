package com.pos.demo.models;

// Class representing payment details
public class PaymentDetail {

    // Name of the branch (required)
    public String branchName;

    // Branch code (required)
    public String branchCode;

    // Unique identifier for a sale (required)
    public String invoiceNumber;

    // Date of sale in ISO format with timezone (in branch timezone) (required)
    public String invoiceDate;

    // Total item amount (required)
    public double invoiceAmount;

    // Payment mode (required)
    public String mode;

    // Payment date
    public String paymentDate;

    // Payment amount (required)
    public double amount;

    // Payment reference
    public String reference;

    // Name of the person who posted the Payment (required)
    public String paymentBy;
}