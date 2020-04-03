package StringAssignments;

import java.util.Scanner;
import java.util.Stack;
public class Prog5_7 {

    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack();
        char[] ch=s.toCharArray();
        int count=0;
        for(int i=0; i<ch.length; i++) {
            if(ch[i]=='{' || ch[i]=='[' || ch[i]=='(') {
                stack.push(ch[i]);
                count++;
            } else if(ch[i]=='}') {
                if(count>0 && stack.pop()=='{') {
                    count--;
                } else {
                    return false;
                }
            } else if(ch[i]==')') {
                if(count>0 && stack.pop()=='(') {
                    count--;
                } else {
                    return false;
                }
            } else if(ch[i]==']') {
                if(count>0 && stack.pop()=='[') {
                    count--;
                } else {
                    return false;
                }
            }
        }
        if(count==0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();

        boolean result=isValid(str);

        if(result)
            System.out.println("Valid paranthesis");
        else
            System.out.println("InValid paranthesis");
    }
}