package ArrayAssignments;

public class Prog4_8 {

    static int removeDuplicates(int arr[], int n)
    {
        // Return, if array is empty
        // or contains a single element
        if (n==0 || n==1){}


        int[] temp = new int[n];

        // Start traversing elements
        int j = 0;
        for (int i=0; i<n-1; i++)

            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];

        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        temp[j++] = arr[n-1];

        // Modify original array
        for (int i=0; i<j; i++)
            arr[i] = temp[i];

      return j;


    }

    public static void main (String[] args)
    {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;

       n= removeDuplicates(arr, n);
       System.out.println("New Size:"+n);
        // Print updated array
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}
