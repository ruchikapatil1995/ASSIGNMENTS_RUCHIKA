package ArrayAssignments;

import java.util.*;
public class Prog4_9
{
    public static ArrayList<Integer> two_sum_array_target(final List<Integer> a, int b) {

        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(1);
        for(int i = 0; i < a.size(); i++){
            if(hmap.containsKey(a.get(i))){
                int index = hmap.get(a.get(i));
                result.set(0, index );
                result.set(1, i );
                break;
            }
            else{
                hmap.put(b - a.get(i), i);
            }
        }

        return result;
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        int target = 6;
        ArrayList<Integer> result = two_sum_array_target(arr, target);
        for(int i : result)
            System.out.print("Element: "+(i) + " ");
    }
}
