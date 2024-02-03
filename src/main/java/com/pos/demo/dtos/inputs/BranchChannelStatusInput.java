package com.pos.demo.dtos.inputs;

public class BranchChannelStatusInput {
    // Rista branch code.
    private String branch;

    // Rista channel name.
    private String channel;

    // Status of the branch channel (Active/Inactive).
    // Enum values: Active, Inactive.
    private String status;

    // Status reason. Required for Inactive status update.
    private String reason;
}
