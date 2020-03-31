package com.company;

public class SWAP_NUMBERS {

    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int temp=0;
        System.out.println("value of x - " + x);
        System.out.println("value of y - " + y);

        //  swap without variable
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Value of x after swap - " + x);
        System.out.println("Value of y after swap - " + y);

        //  swap with 3rd variable
        temp = x;
        x = y;
        y = temp;

        System.out.println("Value of x after swap - " + x);
        System.out.println("Value of y after swap - " + y);
    }
    
}
