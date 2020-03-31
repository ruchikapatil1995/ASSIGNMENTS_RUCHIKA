package com.company;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        int x,y;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two nos:");

        x=in.nextInt();
        y=in.nextInt();

        int z=x+y;

        System.out.println("Addition:"+z);

    }
}
