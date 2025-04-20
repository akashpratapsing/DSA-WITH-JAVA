import java.util.*;

public class SubArrayMax {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i <= n - k; i++) {
            list.add(getMaxInRange(arr, i, k + i - 1));
        }

        return list;
    }

    static int getMaxInRange(int[] arr, int start, int end) {
        int max = Integer.MIN_VALUE;

        for (int i = start; i <= end; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int arr[] = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };

        System.out.println(max_of_subarrays(arr, 10, 4).toString());
    }

}
