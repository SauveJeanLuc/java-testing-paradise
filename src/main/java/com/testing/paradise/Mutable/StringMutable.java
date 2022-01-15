package com.testing.paradise.Mutable;

public class StringMutable {

    public static String TestMutability(){
        int checkInt = 1;
        String userType = "User";

        if(checkInt == 1){
            userType = "Passed";
        }else {
            userType = "Failed";
        }

        return  userType;
    }

    public static void main(String[] args) {
        System.out.println(TestMutability()); // Passed
    }

}
