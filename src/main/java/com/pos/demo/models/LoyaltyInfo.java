package com.pos.demo.models;

public class LoyaltyInfo {

    // Points balance as of this request
    private double points;

    // Present only for /customer GET output. Points reserved against open orders
    private double reservedPoints;

    // Points Ending this month
    private double pointsEndingThisMonth;

    // Points Ending next month
    private double pointsEndingNextMonth;

}
