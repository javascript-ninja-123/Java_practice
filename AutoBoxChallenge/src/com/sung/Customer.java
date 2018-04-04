package com.sung;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transaction = new ArrayList<Double>();

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transaction.add(initialTransaction);
    }

    public static Customer createCustomer(String name,double initialTransaction){
        return new Customer(name,initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> addTrasaction(double transaction){
        this.transaction.add(transaction);
        return this.transaction;
    }


    public ArrayList<Double> getTransaction() {
        return transaction;
    }

}
