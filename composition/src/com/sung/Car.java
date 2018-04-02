package com.sung;

public class Car extends Vehicle{
    private int doors;
    private int engineCapcity;

    public Car(String name, int doors, int engineCapcity) {
        super(name);
        this.doors = doors;
        this.engineCapcity = engineCapcity;
    }
}
