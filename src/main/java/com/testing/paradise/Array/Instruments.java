package com.testing.paradise.Array;

class Instruments {
    public static void main(String[] args) {
        String[] bandInstruments = {"bass", "guitar", "electric keyboard", "drums"};
        System.out.println(bandInstruments[2]);
        bandInstruments[2] = "melodica";
        System.out.println(bandInstruments[2]);
        System.out.println(bandInstruments.length);
        String[] quartetInstruments = new String[4];
        quartetInstruments[0] = "violin";
        quartetInstruments[1] = "violin";
        quartetInstruments[2] = "viola";
        quartetInstruments[3] = "cello";

        for (int i = 0; i < quartetInstruments.length; i++) {
            System.out.println(quartetInstruments[i]);
        }

        //electric Keyboard
        //melodica
        //4
        //violin
        //violin
        //viola
        //cello

    }
}