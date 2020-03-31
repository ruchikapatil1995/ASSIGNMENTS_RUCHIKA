package com.company;

import java.util.Scanner;


public class CharacterDemo {

   static boolean contains(char c, char[] array) {
        for (char x : array) {
            if (x == c) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        char [] chr={'r','a','n','d','o','m'};

        System.out.println("Enter a character:");
        Scanner sc=new Scanner(System.in);

       String input = sc.next();
       char ch=input.charAt(0);

       if (contains(ch,chr))
       {
           System.out.println("FOUND");
       }
       else
           System.out.println("NOT FOUND");




    }
}
