package ArrayAssignments;
import java.util.Arrays;
public class Prog4_11
{

    public static void rearrangeArray(int arr[], int n)
    {
      
        int max = n - 1, min = 0;

       
        int max_elem = arr[n - 1] + 1;

      
        for (int i = 0; i < n; i++) {
        
            if (i % 2 == 0) {
                arr[i] += (arr[max] % max_elem) * max_elem;
                max--;
            }

         
            else {
                arr[i] += (arr[min] % max_elem) * max_elem;
                min++;
            }
        }

     
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] / max_elem;
    }



    public static void main (String[] args)
    {
        int[] arr = { 45, 46, 84, 43, 27 };

        rearrangeArray(arr,arr.length);


        System.out.println(Arrays.toString(arr));
    }
}