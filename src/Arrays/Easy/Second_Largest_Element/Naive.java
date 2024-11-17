
package Arrays.Easy.Second_Largest_Element;
import java.util.*;
public class Naive {
    public static void main(String[] args) {

//      BruteForce
        int[] arr = {8, 2, 2, 3, 10, 3, 4, 9};
//        int[] arr = {1, 7, 7, 7, 7};
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));   -->   use (Arrays.toString(arr)) to print array
        int largest = arr[arr.length-1];
        int secondLargest = 0;
//        System.out.println(largest);
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }
        System.out.println(secondLargest);
    }
}

//  TC = N log(N) -- or -- N(log(N)+1) --> in worst case
//  SC = O(1)
