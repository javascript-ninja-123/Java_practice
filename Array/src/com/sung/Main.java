package com.sung;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntergers = getIntegers(5);
        System.out.println(myIntergers);


	// write your code here
        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(myIntArray[0]);


        int[] mySecondArray = new int[10];
        printArray(mySecondArray);



    }


    public static int[] getIntegers(int num){
        System.out.println("Enter " + num + " integer value");
        int[] values = new int[num];
        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            array[i] = i +1;
            System.out.println("MySecondArray " + i + " is " + array[i]  );
        }
    }
}
