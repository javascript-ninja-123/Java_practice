package com.sung;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;



    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, size, 1, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog is chewing");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() is called");
        chew();
        super.eat();
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLengs() is caleed");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() is called");
        moveLegs(speed);
        super.move(speed);
    }

    public void walk(){
        System.out.println("Dog.walk() is called");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run() is called");
        super.move(10);
    }

}
