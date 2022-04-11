package com.testing.paradise.NullChecker;

class NullContainer{

}

class ContainsNull{

    private NullContainer nullContainer;

    public NullContainer getNullContainer() {
        return nullContainer;
    }

}

public class GetNull {
    public static void main(String[] args) {
        ContainsNull nulling = new ContainsNull();

        if(nulling.getNullContainer() == null){
            System.out.println(" The Check works :) ");
        };

    }
}
