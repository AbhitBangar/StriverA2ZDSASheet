package Arrays.Easy;

public class Check_if_Array_is_Sorted {
    public static void main(String[] args) {
//        int arr[] = {1, 2, 1, 3, 4}, n = 5;             // Not a Java-style array declearation
        int[] arr = {1, 2, 1, 3, 4};
        int n =5;

        if(isSorted(arr, n)) {
            System.out.println("Array is sorted:)");
        } else {
            System.out.println("Array is not sorted:(");
        }
    }

    static boolean isSorted (int arr[], int n) {
        for(int i = 1; i < n; i++) {
            if(arr[i] < arr[i-1])
                return false;
        }
        return true;
    }

//  TC = O(N)
//  SC = O(1)

//    public static void main(String[] args) {
//        boolean isSorted = true;
//        int[] arr = {1, 2, 5, 3, 4};
//        for(int i = 1; i < arr.length; i++) {
//            if(arr[i] >= arr[i-1]) {                            // for non decending
//            } else {
//                isSorted = false;
//            }
//        }
//        if(isSorted) {
//            System.out.println("Array is sorted:)");
//        } else {
//            System.out.println("Array is not sorted:(");
//        }
//    }

}
