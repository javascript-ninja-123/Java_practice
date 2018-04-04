package com.sung;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String additionName;
    private double additionPrice = 0;

    private String addition2Name;
    private double addition2Price = 0;

    private String addition3Name;
    private double addition3Price = 0;

    private String addition4Name;
    private double addition4Price = 0;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }


    public void addHamburgerAddition1(String name, double price){
        this.additionName = name;
        this.additionPrice = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHanburger(){
        System.out.println("Hamburger name is " + this.name);
        double hamburgerPrice =  this.price + this.additionPrice + this.addition2Price + this.addition3Price + this.addition4Price;
        return hamburgerPrice;
    }

}
