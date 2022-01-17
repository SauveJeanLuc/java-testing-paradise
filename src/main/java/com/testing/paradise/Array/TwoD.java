package com.testing.paradise.Array;

public class TwoD {

    public static void main (String[] args){
        char[][] letters = {{'A', 'a'}, {'B', 'b'}, {'C', 'c'}};

        System.out.println(letters[0]);
        System.out.println(letters[0].length);

        for (int i = 0; i < letters.length; i++){
            for (int j = 0; j < letters[0].length; j++){
                System.out.print(letters[i][j]);
            }
        }

        // Prints: AaBbCc
    }


}
