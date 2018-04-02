package com.sung;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        for(int i=2; i<9; i++){
//            System.out.println("10,000 at "+ i+ "% interst  = " + String.format("%.2f",calculateInterest(10000.0,i * 1.0)));
//        }
//        for(int i=8; i>1; i--){
//            System.out.println("10,000 at "+ i+ "% interst  = " + String.format("%.2f",calculateInterest(10000.0,i * 1.0)));
//        }
//
//        int count = 0;
//        while(count <5){
//            System.out.println(count);
//            count++;
//        }
//
//        count =0;
//        for(int i=0; i<5; i++){
//            System.out.println(count);
//            count++;
//        }
//
//        count = 6;
//        do{
//            System.out.println("Count value was" + count);
//            count++;
//            if(count > 100){
//                break;
//            }
//        }while(count !=6);

//            int number  = 4;
//            int finishNumber = 20;
//            int evenNumberFounded = 0;
//
//            while(number <= finishNumber){
//                number++;
//                if(!isEvenNumber(number)){
//                    continue;
//                }
//                System.out.println("Even number " + number);
//                evenNumberFounded++;
//                if(evenNumberFounded == 5){
//                    break;
//                }
//
//            }
//
//             System.out.println("Even number is founded " + evenNumberFounded);
//
//
//            int s = 0;
//            int f = 10;
//            while(s <=f){
//                if(s == f){
//                    System.out.println("It is finished");
//                }
//                System.out.println(s);
//                s++;
//            }

        loopWhile(1,5,0);

    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
    public static boolean isEvenNumber(int num){
        if(num % 2 == 0) return true;
        return false;
    }

    public static void loopWhile(int start, int finish,int count){
        while(start <= finish){
            System.out.println(count);
            count++;
            start++;
        }
    }
}
