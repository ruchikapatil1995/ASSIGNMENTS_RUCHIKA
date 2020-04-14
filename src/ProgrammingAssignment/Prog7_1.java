package ProgrammingAssignment;

import java.util.Scanner;

public class Prog7_1 {

    public static void main(String[] args) {
        System.out.print("Enter a String");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        char[] strrev=str.toCharArray();
        System.out.print("String Reverse:");
        for (int i = strrev.length-1; i >=0 ; i--) {
            System.out.print(strrev[i]);
        }
    }
}
