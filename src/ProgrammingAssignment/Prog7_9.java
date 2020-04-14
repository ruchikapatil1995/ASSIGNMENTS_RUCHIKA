package ProgrammingAssignment;

public class Prog7_9 {

    public static void main(String[] args) {

        int[] array={12,23,43,1,22,44,56};

        int max_val=array[0];

        for (int i = 0; i < array.length; i++) {
                if(max_val<array[i])
                {
                    max_val=array[i];
                }
        }

        System.out.println("Max Value="+max_val);
    }
}
