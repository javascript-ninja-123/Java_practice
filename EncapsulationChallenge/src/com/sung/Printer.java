package com.sung;

public class Printer {
    private int toner = 100;
    private int printedPages;
    private boolean canPrintedBothSide;

    public Printer(int toner){
        this(toner, true);
    }

    public Printer(int toner, boolean canPrintedBothSide) {
        if(toner >0 && toner <=100){
            this.toner = toner;
        }
        else{
            this.toner = -1;

        }
        this.canPrintedBothSide = canPrintedBothSide;
        this.printedPages = 0;
    }

    public int printPages(int pages){
        if(canPrintedBothSide){
            printedPages = (pages /2 ) + (pages % 2 );
            return printedPages;
        }
        this.printedPages += pages;
        return this.printedPages;
    }

    public int addToner(int toneAmount){
        if(toneAmount > 0 && toneAmount <=100){
            if(this.toner + toneAmount > 100){
                return -1;
            }
            this.toner += toneAmount;
            return this.toner;
        }else{
            return -1;
        }
    }

    public int getToner() {
        return toner;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public boolean isCanPrintedBothSide() {
        return canPrintedBothSide;
    }

}
