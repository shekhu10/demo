package com.pos.demo.models;

import com.pos.demo.models.enums.Day;

public class WeeklySchedule {
    // Calendar day of the week.
    // Enum values: [ Mon, Tue, Wed, Thu, Fri, Sat, Sun ]
    private Day day;

    // Schedule for a given day.
    private TimeSlot[] slots;
}
