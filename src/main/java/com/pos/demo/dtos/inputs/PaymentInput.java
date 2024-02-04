package com.pos.demo.dtos.inputs;

// Payment model to add to a sale
public class PaymentInput {

    // External payment identifier to uniquely identify the payment (required)
    public String transactionId;

    // Invoice number of the sale for which you want to add payment to (required)
    public String invoiceNumber;

    // Payment amount (required)
    public double amount;

    // Mode of payment (required), e.g., credit/loyalty points etc.
    public String mode;

    // Additional payment mode info, e.g., last 4 digits (xx3333) of card in the case of credit card.
    public String reference;

    // If true, close the sale if the remaining balance is zero.
    public boolean closeIfZeroBalance;

    // Tip amount
    public double tipAmount;
}