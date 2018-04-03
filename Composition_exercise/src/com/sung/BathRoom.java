package com.sung;

public class BathRoom {
    private String tileColor;
    private int width;
    private int height;
    private boolean haveBathTube;

    public BathRoom(String tileColor, int width, int height, boolean haveBathTube) {
        this.tileColor = tileColor;
        this.width = width;
        this.height = height;
        this.haveBathTube = haveBathTube;
    }

    public void turnOnWater(){
        System.out.println("turn on water to have a bath");
    }

}
