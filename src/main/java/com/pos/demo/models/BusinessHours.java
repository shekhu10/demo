package com.pos.demo.models;

import java.util.List;

public class BusinessHours {
    // Weekly schedule for each business day.
    // If not present for a day, then not available on that day.
    private List<WeeklySchedule> businessDays;

}
