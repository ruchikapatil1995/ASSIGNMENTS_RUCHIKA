package com.company;

import java.util.Scanner;

public class USERInput {

    public static void main(String[] args) {

        String str;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string: ");
        str = in.nextLine();
        System.out.println("Input String is: "+str);


    }
}
