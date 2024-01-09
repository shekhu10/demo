package com.pos.demo.models;


public class SettlementInfo {

    // Reference to settlement info, if the transaction is related to a settlement
    private String settlementId;

    // Reference to settlement, populated by the backend
    private String businessUserId;

    // Provided in input to save, not persisted
    private UserInfo userInfo;

}