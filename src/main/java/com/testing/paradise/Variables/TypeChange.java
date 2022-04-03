package com.testing.paradise.Variables;

public class TypeChange {
    public static String variable = "Value to change";

    public int intProvider() {
        int variable = 10;
        return variable;
    }

    public static void main(String[] args) {

        System.out.println(String.format("Value of variable within method scope: %s ", variable));

    }

}
