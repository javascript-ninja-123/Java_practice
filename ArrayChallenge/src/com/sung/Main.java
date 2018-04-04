package com.sung;
import java.util.Arrays;


public class Main {
    private static int[] numArray = {106,26,81,5,15};

    public static void main(String[] args) {
	// write your code here
        sortArray(numArray);
        printArray(numArray);
        resizeArray();
        System.out.println("now array accepts 12 ele");
        numArray[5] = 200;
        System.out.println(Arrays.toString(numArray));
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    public static void sortArray(int[] array){
        int[] sortedArray = copyArray(array);
        Arrays.sort(sortedArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] copyArray(int[] array){
        return Arrays.copyOf(array,array.length);
    }

    private static void resizeArray(){
        int[] original = numArray;
        numArray = new int[6];
        for(int i=0;i<original.length; i++){
            numArray[i] = original[i];
        }
    }

}
