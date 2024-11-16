package Arrays.Easy;

public class Largest_Element {
    public static void main(String[] args) {  //O(N)
        int[] arr = {1, 7, 5, 3, 2, 6, 8, 10};
        int largest = arr[0];

//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] > largest)
//                largest = j;
//        }

        for (int j : arr) {
            if (j > largest)
                largest = j;
        }
        System.out.println(largest);
    }
}

//    TC = O(N)
//    SC = O(1)