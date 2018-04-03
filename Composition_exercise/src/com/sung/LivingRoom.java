package com.sung;

public class LivingRoom {
    private String sofa;
    private String TV;
    private int width;
    private int height;

    public LivingRoom(String sofa, String TV, int width, int height) {
        this.sofa = sofa;
        this.TV = TV;
        this.width = width;
        this.height = height;
    }

    public void turnOnTv(){
        System.out.println("Living Room turnOnTV() is called");
    }

    public String getTV() {
        System.out.println("Living Room.getTV() is called " + TV);
        return TV;
    }

    public String getSofa() {
        System.out.println("Living Room.getSofa() is called " + sofa);
        return sofa;
    }
}
