package com.sung;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static GroceryList mygroceryList = new GroceryList();
    public static void main(String[] args) {
	// write your code here

        addGrocery("milk");
        addGrocery("cow");
       printGrocery();
        findGrocery("milk");
        processArrayList();
    }


    public static void addGrocery(String item){
        mygroceryList.addItem(item);
    }

    public static void printGrocery(){
        mygroceryList.printGroceryList();
    }

    public static void findGrocery(String item){
        if(mygroceryList.onFlie(item)){
            System.out.println(item);
        }
        else{
            System.out.println("Not in the file");
        }
    }

    public static void processArrayList(){
//        ArrayList<String> newArray = new ArrayList<String>();
//        newArray.addAll(mygroceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(mygroceryList.getGroceryList());


        String[] myArray = new String[mygroceryList.getGroceryList().size()];
        myArray = mygroceryList.getGroceryList().toArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
