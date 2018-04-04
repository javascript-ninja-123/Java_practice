package com.sung;


import java.util.ArrayList;


class IntClass{
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {

        return value;
    }

    public IntClass(int value) {

        this.value = value;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] setArray = new String[10];
        int[] intArray = new int[10];
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("yes");
        ArrayList<IntClass> IntArrayList = new ArrayList<IntClass>();
        IntArrayList.add(new IntClass(545));

        Integer integer = new Integer(545);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intergerList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++){
            intergerList.add(Integer.valueOf(i));
        }

        for(int i=0; i<=10; i++){
            System.out.println(intergerList.get(i));
        }


        Integer myValue = 56;
        int myInt = myValue;

        ArrayList<Double> myDobuleValues = new ArrayList<Double>();
        for(double i=0.0; i<=10.0;i+=0.5){
            myDobuleValues.add(i);
        }

        myDobuleValues.forEach(v -> System.out.println("this is a double Value " + v));

    }
}














