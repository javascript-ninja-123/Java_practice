package com.sung;

public class Kitchen {
    private int width;
    private int height;
    private String table;
    private String chairs;


    public Kitchen(int width, int height, String table, String chairs) {
        this.width = width;
        this.height = height;
        this.table = table;
        this.chairs = chairs;
    }

    public void boilFood(){
        System.out.println("Kitchen.boilFood() is called");
    }
}
