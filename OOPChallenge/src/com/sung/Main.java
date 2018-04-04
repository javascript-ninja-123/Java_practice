package com.sung;

public class Main {

    public static void main(String[] args) {
	// write your code here



     Hamburger myHamburger = new Hamburger("Cheese burger","beef", 9.8, "Wheat");
     double total = myHamburger.itemizeHanburger();
        System.out.println(total);
       myHamburger.addHamburgerAddition1("tomato", 0.5);
        myHamburger.addHamburgerAddition1("lettuce", 0.27);
       total = myHamburger.itemizeHanburger();
        System.out.println(total);

        DeluxeHamburger deluxHamburger = new DeluxeHamburger();
        System.out.println("Delux" + deluxHamburger.itemizeHanburger());


    }
}
