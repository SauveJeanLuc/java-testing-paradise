package com.testing.paradise.Iterations;

import java.util.ArrayList;
import java.util.List;

public class CheckNullPointerException {
    public static void main(String[] args) {
        List<String> forTest = new ArrayList<>();

        for(String tested : forTest){
            System.out.println(tested);
        }
    }

}
