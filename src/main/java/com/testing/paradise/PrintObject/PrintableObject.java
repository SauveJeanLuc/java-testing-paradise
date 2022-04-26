package com.testing.paradise.PrintObject;

class Print {
    public Print(String name, String fullName) {
        this.name = name;
        this.fullName = fullName;
    }

    public String name;
    public String fullName;
}
public class PrintableObject {

    public static void main(String[] args) {

        Print print = new Print(" Remember "," me ");

        System.out.println(print);

    }

}
