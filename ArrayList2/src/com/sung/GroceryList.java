package com.sung;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();


    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addItem(String item){
        groceryList.add(item);
    }

    public void modifyItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >=0) {
            modifyItem(position, newItem);
        }
    }

    public void removeItem(String item){
        int position = findItem(item);
        if(position >=0){
            removeItem(position);
        }
    }


    private void modifyItem(int position, String newItem){
        groceryList.set(position, newItem);
    }
    private void removeItem(int position){
        groceryList.remove(position);
    }

    public void printGroceryList(){
        System.out.println("You have size of " + groceryList.size());
    }

    public int findItem(String searhItem){
            return groceryList.indexOf(searhItem);
    }

    public boolean onFlie(String searchItem){
        int position = findItem(searchItem);
        if(position >=0){
            return true;
        }
        else return false;
    }
}
