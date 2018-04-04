package com.sung;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> newBranch = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
    }

    public Branch addBranch(String branchName){
        if(findBranch(branchName)){
            System.out.println("There is a branch called " + branchName);
            Branch existingBranch = queryBranch(branchName);
            return existingBranch;
        }
        else{
            System.out.println("We added a new branch");
            Branch newBranch = new Branch(branchName);
            this.newBranch.add(newBranch);
            return newBranch;
        }
    }



    public void addCustomer(String branchName, String customerName, double initialTransaction){
        if(queryBranch(branchName) == null){
            System.out.println("Branch does not exist, so we created one for you");
            Branch newBranch = addBranch(branchName);
            newBranch.createAccount(customerName,initialTransaction);
        }
        else{
            System.out.println("customer is added with initial transaction");
            Branch existingBranch =  queryBranch(branchName);
            existingBranch.createAccount(customerName,initialTransaction);
        }
    }

    public void addCustomerTransaction(String branchName, String customerName, double amount){
        if(queryBranch(branchName) == null){
            System.out.println("Branch does not exist");
        }
        else{
            System.out.println("customer added more transaction");
            Branch existingBranch =  queryBranch(branchName);
            existingBranch.addTransaction(customerName,amount);
        }
    }

    public void listCustomers(String branchName, boolean showTransactions){
        if(queryBranch(branchName) == null){
            System.out.println("This branch does not exsit");
        }
        else{
            Branch existingBranch = queryBranch(branchName);
            ArrayList<Customer> customerList = existingBranch.getCustomers();
                for(int i=0; i<customerList.size(); i++){
                    System.out.println("Customer name " + customerList.get(i).getName());
                    if(showTransactions){
                       ArrayList<Double> transactions = customerList.get(i).getTransaction();
                       for(int j=0; j<transactions.size(); j++){
                           System.out.println("transaction " + transactions.get(j));
                       }
                    }
                }

        }
    }

    private boolean findBranch(String branchName){
        Branch existingBranch;
        existingBranch =queryBranch(branchName);
        return existingBranch != null ? true : false;
    }

    private Branch queryBranch(String branchName){
        Branch existingBranch;
        existingBranch = newBranch.stream()
                .filter(c -> c.getName().equals(branchName))
                .findFirst()
                .orElse(null);
        return existingBranch;
    }

}
