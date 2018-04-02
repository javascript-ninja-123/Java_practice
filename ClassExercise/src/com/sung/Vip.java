package com.sung;

public class Vip {
    private String name;
    private double creditLimit;
    private String email;

    public Vip(){
        this("Default Nmae", 0.00,"default@gmail.com");
        System.out.println("It is an empty constructor");
    }

    public Vip(String name, double creditLimit) {
        this(name,creditLimit,"default@gmail.com");
    }

    public Vip(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return  this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}
