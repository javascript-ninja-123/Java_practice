package com.sung;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicle newVehicle = new Vehicle("blue");
        BMW i8 = new BMW("black", 10000, "i8", 2016);
        i8.handSteering(120);
        i8.changeGear(80);
        int d = i8.getCurrentDirection();
        int v = i8.getCurrentVelocity();
        i8.sprint(100,50);
        System.out.println("Veloicty is " + v + " and direction is " + d);
    }
}
