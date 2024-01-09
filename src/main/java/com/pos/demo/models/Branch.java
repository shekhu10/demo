package com.pos.demo.models;

import com.pos.demo.models.enums.BranchStatus;

import java.util.List;

//    description:Branch model
public class Branch {

    //    Name of the branch
    private String branchName;

    //    Branch code
    private String branchCode;

    //    Branch business name
    private String businessName;

    //    Status of branch.
    private BranchStatus status;

    //    address
    private Address address;

    //    Channels defined on the branch
    private List<BranchChannel> channels;

    //    tax area attached to branch.
    private String taxArea;

    //    Pricebook attached to the branch.
    private String pricebook;

    //    Branch labels in comma separated fashion
    private String branchLabels;

}
