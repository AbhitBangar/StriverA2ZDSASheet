package Arrays.Easy;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {2, 34, 5, 6, 3, 33};
        int number = 5, index = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == number)
                index = i;
            break; // --> no need to keep traverse rest of the array
        }
        System.out.println(index);
    }
}

//TC = O(N;
//SC = O(1);
