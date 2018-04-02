package com.sung;

import java.awt.*;

public class Case {
    private String model;
    private String manufacurer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacurer, String powerSupply,Dimensions dimensions) {
        this.model = model;
        this.manufacurer = manufacurer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public String getModel() {
        return model;
    }

    public String getManufacurer() {
        return manufacurer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }


}
