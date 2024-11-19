package Arrays.Easy;

import java.util.*;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1,2, 2, 2, 3,3, 3,4,4,4,4,4,4,4,4,4,5,5,5,5,5,6,6,6,6,7,8,9};
//        Set<Integer> uniqueSet= convertArrayToSet(arr);
        Integer outputArray[] = removeDuplicatesFromArray(arr);
        for(int x:outputArray)
            System.out.println(x);
        //System.out.println(outputArray);
    }

    public static Integer[] removeDuplicatesFromArray(int[] arr) {
        ArrayList<Integer> uniqueArray = new ArrayList<>();
        int i=0,j=0;

        while(j<arr.length)
        {
            if(i==j) {
                uniqueArray.add(arr[j]);
                j++;
            }
            else {
                if(arr[i]==arr[j])
                {
                    j++;
                }
                else {
                    uniqueArray.add(arr[j]);
                    i=j;
                    j++;
                }
            }
        }
//        int size = uniqueArray.size();
//        int newArray[] = new int[size];
//        int index=0;
//        for(int number : uniqueArray)
//            newArray[index++]=number;
//        return newArray;

//        Striver's Solution
//        int i = 0;
//        for(int j = 1; j < n; j++) {
//            if(arr[i] != arr[j]) {
//                arr[i+1] = [j];
//                i++;
//            }
//        }
//        return i+1;

        return uniqueArray.toArray(new Integer[0]);


    }

//  TC = O(N)
//  SC = O(1)




//    public static Set<Integer> convertArrayToSet(int[] array) {
//        Set<Integer> set = new HashSet<>();
//        for(int num : array) {
//            set.add(num);
//        }
//        return set;
//    }

//    HW: DIFF BETWEEN int & Integer class .... Uses of INTEGER CLASS

}
