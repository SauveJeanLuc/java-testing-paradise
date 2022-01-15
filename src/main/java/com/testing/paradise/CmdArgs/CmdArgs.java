package com.testing.paradise.CmdArgs;

public class CmdArgs {

    private static String generateUTFF(String firstCodePoint, String lastCodePoint){
        return String.format("U+%s || U+%s", firstCodePoint, lastCodePoint);
    }
    public static void main(String[] args){
        String lastCodePoint = "007F";

        System.out.println(
                generateUTFF(args[0], lastCodePoint)
        );
    }


}
