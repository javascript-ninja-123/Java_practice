package com.sung;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimesions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240",dimesions);
        Monitor newMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2550,1440));
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4,6, "v2");
        PC thePc = new PC(theCase,newMonitor,motherboard);



       thePc.powerUp();
    }
}
