package com.testing.paradise.GetSet;

public class PredictGetSetOutput {
    private String implementor;

    public PredictGetSetOutput(String name) {
        this.implementor = name;
    }

    public String getImplementor() {
        return implementor;
    }

    public void setImplementor(String newName) {
        implementor = newName;
    }

    public static void main(String[] args) {
        PredictGetSetOutput extender = new PredictGetSetOutput("UTF-8");
        extender.setImplementor("UTF-91");
        System.out.println(extender.getImplementor());
    }

}
