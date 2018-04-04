package com.sung;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your groceryList");
        for(int i =0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifiyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery Item" + (position + 1) + " has modified");
    }

    public void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    public String findGroceryItem(String searchItem){
        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position >=0){
            return groceryList.get(position);
        }
        return null;
    }
}
