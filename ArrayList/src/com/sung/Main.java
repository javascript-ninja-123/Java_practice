package com.sung;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while(!quit){
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();


            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                     searchItem();
                     break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }


    public static void printInstructions(){
        System.out.println("Choose your number");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery Item");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter Item Number");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifiyGroceryItem(itemNo - 1,newItem);
    }


    public static void removeItem(){
        System.out.print("Enter Item Number");
        int itemNo = scanner.nextInt();
        groceryList.removeGroceryItem(itemNo -1);
    }

    public static void searchItem(){
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findGroceryItem(searchItem) != null){
            System.out.println("I found " + searchItem);
        }
        else{
            System.out.println("Search item is not in the list");
        }
    }

}
