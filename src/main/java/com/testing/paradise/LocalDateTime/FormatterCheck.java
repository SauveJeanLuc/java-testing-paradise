package com.testing.paradise.LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatterCheck {
    public static void main(String[] args) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse("02/04/2003", formatter);
            System.out.println(date);
        }catch(Exception e){
            System.out.println("You gave an Incorrect date format");
        }
    }

}
