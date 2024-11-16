package Arrays.Easy.Second_Largest_Element;

public class Better {
    public static void main(String[] args) {
        int[] arr = {8, 2, 2, 3, 10, 3, 4, 9, 12};
        int largest = arr[0];
        int secondLargest = -1;

        for(int i : arr) {
            if(i > largest){
                largest = i;
            }
        }
//        System.out.println(largest);

        for(int i : arr) {
            if(i > secondLargest && i != largest)
                secondLargest = i;
        }

        System.out.println(secondLargest);
    }
}

//    TC = O(2N) --> {O(N+N}
//    SC = O(1)
