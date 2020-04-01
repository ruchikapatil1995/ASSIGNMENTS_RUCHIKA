package ArrayAssignments;

public class Prog4_3 {


    public static int getSecondSmallest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 2];
    }

    public static void main(String args[]) {
        int a[] = {13, 25, 52, 63, 23, 82};

        System.out.println("Second Smallest: " + getSecondSmallest(a, 6));
    }
}
