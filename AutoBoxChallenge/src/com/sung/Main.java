package com.sung;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank newBank = new Bank("Chase");
        newBank.addBranch("LA");
        newBank.addCustomer("LA", "Sungmin Yi", 10.00);
        newBank.addCustomerTransaction("LA", "Sungmin Yi", 20.00);
        newBank.listCustomers("LA",true);
    }
}
