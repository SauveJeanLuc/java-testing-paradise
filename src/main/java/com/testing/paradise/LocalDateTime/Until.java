package com.testing.paradise.LocalDateTime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Until {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime tenSecondsLater = now.plusSeconds(10);

        LocalDateTime startingDate = LocalDateTime.of(2016, 12, 10,
                14, 30);
        LocalDateTime endingDate  = LocalDateTime.of(2017, 12, 10,
                14, 30);;

        long diff = startingDate.until(endingDate, ChronoUnit.DAYS);
        System.out.println(diff);
    }
}
