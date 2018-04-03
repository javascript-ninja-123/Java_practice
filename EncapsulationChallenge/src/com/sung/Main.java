package com.sung;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer newPrinter = new Printer(80, true);
        System.out.println("inital page count " + newPrinter.getPrintedPages());
        newPrinter.printPages(11);
        System.out.println(newPrinter.getPrintedPages());
    }
}
