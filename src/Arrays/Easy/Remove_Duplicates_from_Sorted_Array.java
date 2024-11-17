package Arrays.Easy;

import java.util.*;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        Set<Integer> uniqueSet= convertArrayToSet(arr);
        System.out.println(uniqueSet);
    }

    public static Set<Integer> convertArrayToSet(int[] array) {
        Set<Integer> set = new HashSet<>();
        for(int num : array) {
            set.add(num);
        }
        return set;
    }

}
