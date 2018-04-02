package com.sung;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Bank Sung = new Bank("1234556", 0.00, "Sungmin Yi", "sung@gmail.com", "5309794087");
    double balance = Sung.deposit(500);
        System.out.println(balance);
     balance = Sung.withdraw(300);
        System.out.println(balance);
        balance = Sung.withdraw(300);
        System.out.println(balance);
        System.out.println(Sung.getBalance());


     Bank Tim = new Bank("12345",0.00,"Sung");
        System.out.println(Tim.getEmail());


        Vip Yonna = new Vip("Yonna", 10000.00, "Yonna@gmail.com");
        System.out.println("Yonna's credit limit is $" + Yonna.getCreditLimit());


    }
}
