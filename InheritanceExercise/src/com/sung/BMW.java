package com.sung;

public class BMW extends Car {
    private String model;
    private int year;
    private int roadServiceMonths;

    public BMW(String color, int price,  int year, int roadServiceMonths) {
        super(color, 4, price, 4, 6, false);
        this.model = "BMW";
        this.roadServiceMonths = roadServiceMonths;
        this.year = year;
    }




    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changeCurrentGear(1);
        }
        else if(newVelocity > 0 && newVelocity <=10){
            changeCurrentGear(1);
        }
        else if(newVelocity > 10 && newVelocity <=20){
            changeCurrentGear(2);
        }
        else if(newVelocity > 20 && newVelocity <=30){
            changeCurrentGear(3);
        }
        else{
            changeCurrentGear(4);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
