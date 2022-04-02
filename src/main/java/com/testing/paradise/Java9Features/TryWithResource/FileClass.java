package com.testing.paradise.Java9Features.TryWithResource;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileClass {

    public static void main(String[] args) throws IOException {
        // Resource can be declared outside the try-with-resource
        // Compile Error is Removed in Java 9

        FileOutputStream fileStream = new FileOutputStream("tryresourcetest.txt");

        try(fileStream){
            String data = "Red Flag";
            byte dataInBytes[] = data.getBytes();
            fileStream.write(dataInBytes);
            System.out.println("File written");
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
