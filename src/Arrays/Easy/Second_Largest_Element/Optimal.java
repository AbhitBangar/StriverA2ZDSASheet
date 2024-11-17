package Arrays.Easy.Second_Largest_Element;

public class Optimal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int largest = arr[0]; // take secondLargest = INT_MINIMUM when array contains -ve integers
        int secondLargest = -1;
        for(int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if(num != largest && num > secondLargest) {
                secondLargest = num;
            }
        }
        System.out.println(secondLargest);
    }
}

//  TC = O(N) --> single pass solution
//  SC = O(1)