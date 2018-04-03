package com.sung;

public class Main {

    public static void main(String[] args) {
	    Home newHome = new Home(
	            new BathRoom("white",20,20,true),
                new Kitchen(30,40,"Ace","Ikea"),
                new Library("Ikea","Ikdea",20,30),
                new LivingRoom("Ikea", "Samsung", 30,30)
        );

	    newHome.powerUp();
	    newHome.tellmeFurnitureBrand();
    }
}
