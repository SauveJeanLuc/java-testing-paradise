package com.testing.paradise.Calculations;

public class PercentageCounter {
    public static void main(String[] args) {
        Double passingLine = Double.valueOf(70);

        Double totalScore = Double.valueOf(0);
        Double totalWorth = Double.valueOf(0);

        totalScore += 5;
        totalWorth += 10;

        totalScore += 20;
        totalWorth += 20;

        System.out.println(" Total Score " + totalScore);
        System.out.println(" Total Worth " + totalWorth);

        double ownedPercentage = ( (totalScore/totalWorth) * 100);

        System.out.println(" Owned Percentage " + ownedPercentage);

        if(ownedPercentage < passingLine){
            System.out.println("Not Yet Competent");
        } else {
            System.out.println("Competent");
        }
    }
}
