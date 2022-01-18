package com.testing.paradise.Class;

class ObjectState {
    String whaleSpecies;
    int whaleWeight;

    public ObjectState(String name, int weight) {
        whaleSpecies = name;
        whaleWeight = weight;
    }

    public String toString(){
        return "This is a " + whaleSpecies + " whale which weighs about " + whaleWeight + " pounds.";
    }

    public static void main(String[] args){
        ObjectState whale1 = new ObjectState("narwhal", 2100);
        ObjectState whale2 = new ObjectState("beluga", 3000);
        System.out.println(whale1);
        System.out.println(whale2);
    }
}
