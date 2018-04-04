package com.sung;



class Car{
    private boolean engine;
    private double cylinders;
    private int wheels;
    private String name;

    public Car(String name, double cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine(){
        return "Default Car Engine is here";
    }


    public String accelerate(){
        return "Accerlator is triggered";
    }

    public String brake(){
        return "Brake is triggered";
    }

    public double getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }
}



class BMW extends Car{
    public BMW(double cylinders) {
        super("BMW", cylinders);
    }

    @Override
    public String startEngine() {
        return "BMW engine is super loud";
    }

    @Override
    public String accelerate() {
        return "BMW is acclerating really fast";
    }

    @Override
    public String brake() {
        return "Brake works within 0.5s";
    }
}

class Audi extends Car{
    public Audi(double cylinders) {
        super("Audi", cylinders);
    }

    @Override
    public String startEngine() {
        return "Audi engine is super loud";
    }

    @Override
    public String accelerate() {
        return "Audi is acclerating really fast";
    }

    @Override
    public String brake() {
        return "Audi works within 0.3s";
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here
        Car newCar = randomCar();
        System.out.println(newCar.accelerate());
        System.out.println(newCar.brake());
    }



    public static Car randomCar(){
        int randomNumber = (int) (Math.random() * 2) + 1;
        switch(randomNumber){
            case 1:
                return new BMW(4.5);
            case 2:
                return new Audi(3.6);
            default:
                return null;
        }
    }
}
