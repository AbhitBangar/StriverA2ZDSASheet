package Arrays.Easy;
import java.util.*;

public class Left_Rotate_an_Array_by_one_place {
    public static void main(String[] args) {
        int[] arr = {1, 12, 2, 3, 4, 5, 11};
        int n = arr.length, temp = arr[0];
        for(int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}

//  TC = O(N)
//  SC = O(1)
