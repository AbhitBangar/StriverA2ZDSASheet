package Arrays.Easy;

public class Move_Zeros_to_End {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZerosToEnd(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }

    public static int[] moveZerosToEnd(int n, int []a) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) return a;

        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;
    }
}

// TC = O(N)
// SC = O(1)
