package com.sung;

public class Car extends Vehicle {
    private int doors;
    private int gears;
    private boolean isMannual;
    private int currentGear;


    public Car(String color, int wheelNumber, int price, int doors, int gears, boolean isMannual) {
        super(color, wheelNumber, price);
        this.doors = doors;
        this.gears = gears;
        this.isMannual = isMannual;
        this.currentGear = 1;
    }

    public void changeCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeCurrentGear() changed to " + this.currentGear);
    }

    public void changeVelocity(int speed, int direction){
        move(speed,direction);
        System.out.println("Car.changeVelocity is called Velocity is " + speed + "direction is " + direction);
    }
}
