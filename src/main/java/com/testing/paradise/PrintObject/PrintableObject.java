package com.testing.paradise.PrintObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;


class Print {
    public Print(String name, String fullName) {
        this.name = name;
        this.fullName = fullName;
    }

    public String name;
    public String fullName;
}
public class PrintableObject {

    public static void main(String[] args) throws JsonProcessingException {

        Print print = new Print(" Remember "," me ");


        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(print);

        System.out.println(json);

    }

}
