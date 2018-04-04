package com.sung;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> newCustomer = new ArrayList<Customer>();

    public Branch(String name) {
        this.name = name;
    }

    public void createAccount(String name, double initialAmount){
        if(findCustomer(name)){
            System.out.println("Already opened an account");
        }
        else{
            System.out.println("New customer is added");
            Customer newcustomer = Customer.createCustomer(name,initialAmount);
            newCustomer.add(newcustomer);
        }
    }

    public boolean findCustomer(String name){
        Customer existingCustomer;
        existingCustomer = queryCustomer(name);
        return existingCustomer != null ? true : false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return newCustomer;
    }

    public void addTransaction(String name, double transaction){
       if(!findCustomer(name)){
           System.out.println("You have to create an account first");
       }
       else{
           System.out.println("transaction added");
           updateCustomer(name,transaction);
       }
    }



    private void updateCustomer(String name, double transaction){
        Customer existing = queryCustomer(name);
        existing.addTrasaction(transaction);
    }


   private Customer queryCustomer(String name){
       Customer existingCustomer;
       existingCustomer = newCustomer.stream()
               .filter(c -> c.getName().equals(name))
               .findFirst()
               .orElse(null);
       return existingCustomer;
   }


    private int findCustomerIndex(Customer customer){
        return newCustomer.indexOf(customer);
    }


}
