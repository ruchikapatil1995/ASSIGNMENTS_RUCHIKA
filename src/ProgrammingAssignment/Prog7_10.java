package ProgrammingAssignment;


import java.io.*;

class Prog7_10 {


    static void combination(int arr[], int data[], int start,
                                int end, int index, int r)
    {

        if (index == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }


        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combination(arr, data, i+1, end, index+1, r);
        }
    }


    static void printCombination(int arr[], int n, int r)
    {

        int data[]=new int[r];


        combination(arr, data, 0, n-1, 0, r);
    }


    public static void main (String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int r = 3;
        int n = arr.length;
        printCombination(arr, n, r);
    }
}


