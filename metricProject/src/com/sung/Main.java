package com.sung;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double result = calcFeetAndInchesToCentimeters(156);
        System.out.println(result);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >0 && (inches >= 0 && inches <=12) ){
          double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            return  centimeters;

        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >=0){
            double feet = (int) inches / 12;
            double remainingInches = (int)  inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        return -1;
    }
}
