package com.testing.paradise.Iterations;

public class TestForEach {

    public static void main(String[] args){

        String[] UTFDerivatives = {"CESU-8", "MySQL utf8mb3", "Modified UTF-8", "WTF-8", "PEP 383"};
        Integer counter = 0;

        for (String derivative : UTFDerivatives){
            System.out.println(String.format("%s. %s", counter, derivative));
            counter++;
        }
    }
}
