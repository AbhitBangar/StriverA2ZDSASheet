package Arrays.Easy;

public class Missing_Number_in_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        for(int i = 1; i < n; i++) {
            int checkingNumber = 0;
            for(int j = 0; j < n-1; j++) {
                if(arr[j] == i) {
                    checkingNumber = 1;
                    break;
                }
            }
            if(checkingNumber == 0) {
                System.out.println(i);
            }
        }
    }
}

//  TC = O(N*N) --> worst case when missing number is N itself, outerloop will run for N times
//  SC = O(1)