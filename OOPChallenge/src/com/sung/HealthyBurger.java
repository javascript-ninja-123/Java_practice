package com.sung;

public class HealthyBurger extends Hamburger {
    private String healthyExtraName;
    private double healthyExtraPrice = 0;

    private String healthyExtraName2;
    private double healthyExtraPrice2 = 0;


    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rype");
    }

    public void addHealthAddition(String name, double price){
        this.healthyExtraName = name;
        this.healthyExtraPrice = price;
    }
    public void addHealthAddition2(String name, double price){
        this.healthyExtraName2 = name;
        this.healthyExtraPrice2 = price;
    }

    @Override
    public double itemizeHanburger() {
        double defaultPrice = super.itemizeHanburger();
        double finalPrice = defaultPrice + this.healthyExtraPrice + this.healthyExtraPrice2;
        return finalPrice;
    }
}
