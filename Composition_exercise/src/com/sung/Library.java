package com.sung;

public class Library {
    private String shelf;
    private String desk;
    private int width;
    private int height;

    public Library(String shelf, String desk, int width, int height) {
        this.shelf = shelf;
        this.desk = desk;
        this.width = width;
        this.height = height;
    }


    public void chooseBook(){
        System.out.println("Library.chooseBook() is called. I choose a book here");
    }
}

