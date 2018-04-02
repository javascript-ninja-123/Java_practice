package com.sung;

public class Bank {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank(){
        this("5675", 0.00,"Default","default@gmail.com","000000000" );
        System.out.println("Empty constructor is called");
    }

    public Bank(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email= email;
        this.phoneNumber = phoneNumber;
    }

    public Bank(String accountNumber, double balance, String customerName) {
        this(accountNumber,balance,customerName,"default@gmail.com","000000000");
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public double deposit(double money){
        this.balance = this.balance + money;
        return this.balance;
    }

    public double withdraw(double money){
        if(this.balance - money < 0){
            return -1;
        }
        this.balance = this.balance - money;
        return this.balance;
    }

}
