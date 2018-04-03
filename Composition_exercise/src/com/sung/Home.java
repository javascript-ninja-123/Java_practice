package com.sung;

public class Home {
    private BathRoom bathroom;
    private Kitchen kitchen;
    private Library library;
    private LivingRoom livingRoom;

    public Home(BathRoom bathroom, Kitchen kitchen, Library library, LivingRoom livingRoom) {
        this.bathroom = bathroom;
        this.kitchen = kitchen;
        this.library = library;
        this.livingRoom = livingRoom;
    }

    private void liteisOn(){
        System.out.println("Home light is on hell yeah baby");
    }

    public void powerUp(){
        this.bathroom.turnOnWater();
        this.kitchen.boilFood();
        this.livingRoom.turnOnTv();
        liteisOn();
    }

    public void tellmeFurnitureBrand(){
        this.livingRoom.getSofa();
        this.livingRoom.getTV();
    }
}
