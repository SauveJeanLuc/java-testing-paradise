package com.testing.paradise.Methods;

public class PredictOutcome {

    public static void printSomething() {
        System.out.println("Something!");
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static int findSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        printSomething();

        printName("Moira");
        printName("Ronnie");

        int product = findSum(3,4);
        System.out.println(product);

        //Something
        //Moira
        //Ronnie
        //7
    }
}