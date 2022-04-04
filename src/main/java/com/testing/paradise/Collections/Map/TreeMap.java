package com.testing.paradise.Collections.Map;

import java.util.Map;

public class TreeMap {

    public static void main(String[] args) {

        Map<String, Integer> values = new java.util.TreeMap<>();

        values.put("Second", 2);
        values.put("First", 1);
        System.out.println("Map using TreeMap: " + values);

        values.replace("First", 11);
        values.replace("Second", 22);
        System.out.println("New Map: " + values);

        int removedValue = values.remove("First");
        System.out.println("Removed value " + removedValue);

    }
}
