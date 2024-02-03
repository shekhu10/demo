package com.pos.demo.models;

public class Schedule {
    // Shedule definitions to be used for items

    // Unique identifier for this schedule.
    private String scheduleId;

    // Schedule name.
    private String name;

    // Optional start date in YYYY-MM-DD format.
    private String startDate;

    // Optional end date in YYYY-MM-DD format.
    private String endDate;


    // Business hours associated with this schedule.
    private BusinessHours itemHours;

}
