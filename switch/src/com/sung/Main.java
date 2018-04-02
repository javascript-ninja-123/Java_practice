package com.sung;

public class Main {

    public static void main(String[] args) {
	// write your code here

       int value = 2;
       if(value == 2 ){
           System.out.println("Value was 2");
       }
       else if(value == 1){
           System.out.println("Value was 1");
       }
       else{
           System.out.println("was not 1 or 2");
       }

       int switchValue = 1;
       switch(switchValue){
           case 1:
               System.out.println("Value is 1");
               break;
           case 2:
               System.out.println("value is 2");
               break;
           default:
               System.out.println("was not 1 or 2");
               break;
       }

       char charValue = 'A';
        switch(charValue){
            case 'A':
                System.out.println("It is A");
                break;
            case 'B':
                System.out.println("It is B");
                break;
            case 'C': case 'D':case  'E':
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println("It is not found");
                break;
        }
    }
}
