package StringAssignments;

public class Prog5_2 {

    public static void main(String[] args) {

        int[] a = {20, 30, 56, 14, 23, 52, 12, 10};
        int temp=0,sum=0;
        //sorting the array

        for (int i = 0; i <8 ; i++) {

            for (int j = 0; j < 8; j++) {

                if(a[i]<a[j])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }

            }
        }

            for (int j = 1; j <7; j++) {
                sum+=a[j];
            }

            System.out.println("Sum of elements other than Highest and lowest elements:"+sum);



    }
}
