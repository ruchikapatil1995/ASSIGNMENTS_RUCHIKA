package ProgrammingAssignment;
import java.util.Arrays;
public class Prog7_3 {
    static void findIntersection(int []arr1,int[] arr2,int len1,int len2)
    {
        if(len1<len2)
        {
            int tempp[] = arr1;
            arr1 = arr2;
            arr2 = tempp;

            int temp = len1;
            len1 = len2;
            len2 = temp;
        }

        Arrays.sort(arr1);

        for (int i = 0; i < len2; i++)
        {
            if (binarySearch(arr1, 0, len1 - 1, arr2[i]) != -1)
                System.out.print(arr2[i] + " ");
        }

    }
    static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l)
        {
            int mid = l + (r - l) / 2;


            if (arr[mid] == x)
                return mid;


            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);


            return binarySearch(arr, mid + 1, r, x);
        }


        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr1={7,5,4,9,1,3};
        int[] arr2={7,6,9,23,14,15,4};

        findIntersection(arr1,arr2,arr1.length,arr2.length);

    }
}
