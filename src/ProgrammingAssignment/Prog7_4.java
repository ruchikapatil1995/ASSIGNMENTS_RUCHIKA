package ProgrammingAssignment;
import java.util.*;
public class Prog7_4 {

    boolean uniqueCharacters(String str)
    {
        char[] chArray = str.toCharArray();


        Arrays.sort(chArray);

        for (int i = 0; i < chArray.length - 1; i++) {

            if (chArray[i] != chArray[i + 1])
                continue;


            else
                return false;
        }
        return true;
    }


    public static void main(String args[])
    {

        Prog7_4 obj = new Prog7_4();
        String input = "Welcom";

        if (obj.uniqueCharacters(input))
            System.out.println("The String " + input
                    + " has all unique characters");
        else
            System.out.println("The String " + input
                    + " has duplicate characters");
    }
}