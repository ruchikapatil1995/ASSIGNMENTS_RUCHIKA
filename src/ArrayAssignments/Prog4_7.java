package ArrayAssignments;

public class Prog4_7 {

    public static void main(String[] args) {
        int arr[] = {5,9,4,6,7,4,45};
        int temp=0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr.length-1 ; j++) {

                if(arr[j] > arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("Maximum no is:"+arr[arr.length-1]+"\tMinimum no is:"+arr[0]+"\tDifference:"+ (arr[arr.length-1] - arr[0]));
    }

}
