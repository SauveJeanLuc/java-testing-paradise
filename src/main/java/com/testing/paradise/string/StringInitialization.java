package com.testing.paradise.string;

public class StringInitialization {



    public static void main(String[] args) {

        String seeIfStringIsMutable = "";
        seeIfStringIsMutable = determineUpdaterDescription(seeIfStringIsMutable, EStringInitialization.BAD);

        System.out.println(seeIfStringIsMutable);
    }
    public static String determineUpdaterDescription(String updaterDescription, EStringInitialization enumValue){
        if(enumValue == EStringInitialization.BAD){
            return updaterDescription = " The DDE of your District ";
        }
        else if(enumValue == EStringInitialization.GOOD){
            return updaterDescription = " The Mayor of your District ";
        }
        else if(enumValue == EStringInitialization.TESTED){
            return updaterDescription = " RTB ";
        }
        else{
            return updaterDescription = " an authorised user ";
        }
    }
}
