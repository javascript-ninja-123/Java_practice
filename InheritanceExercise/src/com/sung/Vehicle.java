package com.sung;

public class Vehicle {
    private String color;
    private int wheelNumber;
    private int price;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String color) {
        this(color,4,0);
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public Vehicle(String color, int wheelNumber, int price) {
        this.color = color;
        this.wheelNumber = wheelNumber;
        this.price = price;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer() is called " + this.currentDirection + " degree");
    }

    public void move(int velocity, int direction){
        this.currentDirection = direction;
        this.currentVelocity = velocity;
        System.out.println("Vehicle.move() called. Moving at " + this.currentVelocity + " and direction is " + this.currentDirection);
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity = 0;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }
}
