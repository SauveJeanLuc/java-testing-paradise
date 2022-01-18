package com.testing.paradise.Class;

public class IntroConstructor {
    public IntroConstructor() {
        System.out.println("Constructor Scope");
    }

    public static void main(String[] args) {
        IntroConstructor scopeOne = new IntroConstructor();
        // Object's Address
        System.out.println(scopeOne);
        // Hash Code
        System.out.println(scopeOne.hashCode());
    }
}
