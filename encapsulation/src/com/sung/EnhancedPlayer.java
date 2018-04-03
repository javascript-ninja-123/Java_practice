package com.sung;

public class EnhancedPlayer {
    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name,int health){
        this(name,health,"sword");
    }


    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <=0){
            this.health = health;
        }
        this.weapon = weapon;
    }


    public void attack(int damage){
        this.health -=damage;
        if(this.health <=0){
            System.out.println("You are dead man, boy!");
        }else{
            getHealth();
        }
    }


    public int getHealth() {
        return health;
    }
}
