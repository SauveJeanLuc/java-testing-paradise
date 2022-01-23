package com.testing.paradise.Conditions;

import com.testing.paradise.Set.ERole;

public class ConditionCheck {
    public static void main(String[] args) {
        if(1 != 4){
            System.out.println("Yes");
        }else{
            System.out.println("Let's check if I might continue");
        }

        if(1 == 1){
            System.out.println("Reached");
        }

        String checkEquals = "DENIEDW";
        if(! (checkEquals.equals(ERole.DENIED.name()) || checkEquals.equals(ERole.SERIALIZED.name() ) )){
            System.out.println("Yes Enum is String");
        }

    }
}
