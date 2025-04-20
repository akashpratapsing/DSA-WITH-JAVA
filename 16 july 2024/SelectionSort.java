import java.util.Arrays;

public class SelectionSort {

    static void sort(int[] arr, int n) {

        for (int i = 0; i < n; i++) {

            int last = n - i - 1;
            int maxIndex = findMax(arr, last);
            swap(arr, maxIndex, last);

        }
    }

    static int findMax(int[] arr, int end) {

        int max = 0;
        for (int i = 0; i <= end; i++) {

            if (arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1, 58 };

        sort(arr, arr.length);

        System.out.println(Arrays.toString(arr));

    }
}
