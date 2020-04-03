package StringAssignments;


import java.io.*;
import java.util.*;

public class Prog5_4 {

    static boolean is_isogram(String str)
    {

        str = str.toLowerCase();
        int len = str.length();

        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }


    public static void main(String[] args)
    {
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(is_isogram(str));

        String[] str1 = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < str1.length; i++)
        {
            String word = str1[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {

                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }

        System.out.println("Reversed String::"+reversedString);


    }
}



