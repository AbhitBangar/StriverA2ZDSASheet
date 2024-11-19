package Arrays.Easy.Left_Rotate_Array_by_D_Places;

public class Optimal {
    public static void main(String args[]) {
        int[] arr = {23, 4, 56, 1, 2, 3, 4, 5, 6, 7};
        int n = 7;
        int d = 2;
        rotateElementToLeft(arr, n, d);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]);
        System.out.println();
    }

    public static void rotateElementToLeft(int[] arr, int n, int k) {
        ReverseArray(arr, 0, k - 1);
        ReverseArray(arr, k , n - 1);
        ReverseArray(arr, 0, n - 1);
    }

    public static void ReverseArray(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

//  TC = O(2N)
//  SC = O(1)