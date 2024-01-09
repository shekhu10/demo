package com.pos.demo.models;

import java.util.List;

//    description: Customer model
public class Customer {
    //    Customer identifier.
    private String id;

    // Branch code of the branch where the customer has performed his last transaction
    private String branchCode;

    // Customer first name
    private String firstName;

    // Customer last name
    private String lastName;

    // Customer email
    private String email;

    // Customer phone number
    private String phoneNumber;

    // Array of Address objects
    private List<Address> addresses;

    // Membership information
    private Membership membership;

    // Loyalty information
    private LoyaltyInfo loyaltyInfo;

    // Customer created on date in YYYY-MM-DD format
    private String createdDate;

    // Tax Identification Number of the customer
    private String taxId;


}
