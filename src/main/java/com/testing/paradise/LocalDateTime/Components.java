package com.testing.paradise.LocalDateTime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class Components {
    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();

        LocalDateTime d = LocalDateTime.of(2016, 12, 10,
                14, 30);

        LocalDateTime startDate = LocalDateTime.of(date.getYear(), date.getMonth(), date.getDayOfMonth(),
                0, 0);
        LocalDateTime endDate = LocalDateTime.of(date.getYear(), date.getMonth(), date.getDayOfMonth(),
                23, 59);

        ValueRange r = d.range(ChronoField.MILLI_OF_DAY);
        System.out.printf("MILLI_OF_DAY: %s%n", r);

        r = d.range(ChronoField.SECOND_OF_MINUTE);
        System.out.printf("SECOND_OF_MINUTE: %s%n", r);

        r = d.range(ChronoField.HOUR_OF_DAY);
        System.out.printf("HOUR_OF_DAY: %s%n", r);

        System.out.println("Decomposable Date: "+d);
        System.out.println("Start Date: "+startDate);
        System.out.println("End Date: "+endDate);
    }
}
