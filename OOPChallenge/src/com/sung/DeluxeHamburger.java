package com.sung;

public class DeluxeHamburger extends Hamburger{

    private String healthyExtraName;
    private double healthyExtraPrice = 0;

    private String healthyExtra2Name;
    private double healthyExtra2Price = 0;

    public DeluxeHamburger() {
        super("Healthy", "Bacon", 14.54, "Brown Rye");
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("Drinks",2.65);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional item to a delux burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional item to a delux burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional item to a delux burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional item to a delux burger");
    }

    public void addHealthAddition1(String name, double price){
        this.healthyExtraName = name;
        this.healthyExtraPrice = price;
    }

    public void addHealthAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHanburger() {
        double totalPrice = super.itemizeHanburger();
        return totalPrice + this.healthyExtraPrice + this.healthyExtra2Price;
    }
}
