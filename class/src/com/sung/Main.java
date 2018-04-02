package com.sung;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car porsche = new Car();
        Car holden = new Car();
        System.out.println(porsche.getModel());
        porsche.setModel("Carrera");
        String result = porsche.getModel();
        System.out.println(result);

    }
}
