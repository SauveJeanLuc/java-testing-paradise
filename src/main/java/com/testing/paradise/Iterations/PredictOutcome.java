package com.testing.paradise.Iterations;

public class PredictOutcome {
    public static void main(String[] args) {
        int num = 0;

        while (num < 10) {
            num++;
            if (num > 10) {
                break;
            }
        }

        // num = 10;
        do {
            System.out.println("Impossible!");
        } while (2 == 4);

        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }

        for (int x : myArray) {
            if (x % 2 == 0) {
                continue;
            }
            System.out.println(x);
        }

        System.out.println(num);

        // Impossible
        //1
        //3
        //5
        //7
        //9
        //10
    }
}