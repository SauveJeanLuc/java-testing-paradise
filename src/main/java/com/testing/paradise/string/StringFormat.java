package com.testing.paradise.string;

import java.time.LocalDateTime;

public class StringFormat {

    public static void main(String[] args) {

        String name = "SAUVE Jean-Luc";
        LocalDateTime date = LocalDateTime.now();

        String welcomeMessage= String.format("Name is %s " +
                " Date is %s " +
                " Enum Value is %s ",name, date, EStringFormat.WORKING);
        System.out.println(welcomeMessage);
    }
}
