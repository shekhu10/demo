package com.pos.demo.models;

import java.util.List;

//    description:holds all settlement transactions of a branch or user
public class BranchTxn {

    //    unique id generated using uuid
    private String mid;

    private String branchCode;
    private String branchName;

    //    transaction audit details
    private String updatedBy;
//    type of transaction For e.g., Open Float, Float, Deposit, Close Deposit, Expense, Transfer Out, Transfer In
    private String transactionType;
//    label for this transaction, useful for aggregation
    private String label;

//    remarks entered by user
    private String remarks;

//    Mode of transaction for e.g., Cash, Card, Voucher
    private String mode;

//    transaction amount
    private double amount;

    private SettlementInfo settlementInfo;
    private List<Attachment> attachments;

}
