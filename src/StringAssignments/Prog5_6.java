package StringAssignments;

import java.util.Scanner;

public class Prog5_6 {

        static void convertOpposite(StringBuffer str)
        {
            int ln = str.length();

           for (int i=0; i<ln; i++)
            {
                Character c = str.charAt(i);
                if (Character.isLowerCase(c))
                    str.replace(i, i+1, Character.toUpperCase(c)+"");
                else
                    str.replace(i, i+1, Character.toLowerCase(c)+"");

            }
        }

        public static void main(String[] args)
        {
            System.out.println("Enter a string:");
            Scanner sc=new Scanner(System.in);
            String str1 = sc.nextLine();
            StringBuffer str = new StringBuffer(str1);

            convertOpposite(str);

            System.out.println(str);
        }
    }

