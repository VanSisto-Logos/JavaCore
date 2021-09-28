package com.logos.lesson21.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);
        localDate = localDate.plusDays(2);
        localDate = localDate.plusYears(3);
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate);


//        System.out.printf("%s text %s text %d",
//                "val1",
//                "val2",
//                5);

        System.out.println(localDate.isLeapYear());


        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.parse("2022-01-01T20:20:20.200");
        System.out.println(localDateTime1);
        System.out.println(localDateTime1.getYear());
        System.out.println(localDateTime1.truncatedTo(ChronoUnit.DAYS));

    }
}
