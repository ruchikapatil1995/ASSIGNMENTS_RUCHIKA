package ProgrammingAssignment;

import java.util.Scanner;

public class Prog7_2 {

   static int UniqueOccurance(String s)
    {
        int[] count = new int[128];
        int len = s.length();
        for (int i=0; i < len; i++) {
            count[s.charAt(i)]++;
        }
        for (int i=0; i < len; i++) {
            if(count[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.print("Enter a String");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        int index = UniqueOccurance(s);

        System.out.println("Non repeating character:"+s.charAt(index));

    }
}
