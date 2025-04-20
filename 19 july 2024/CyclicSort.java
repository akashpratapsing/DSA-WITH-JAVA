import java.util.Arrays;

public class CyclicSort {

    static void sort(int[] arr, int n) {
        int i = 0;
        while (i < n) {
            int correctIdx = arr[i] - 1;
            if (arr[i] != arr[correctIdx]) {
                swap(arr, i, correctIdx);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 2, 5, 7, 6 };

        sort(arr, arr.length);

        System.out.println(Arrays.toString(arr));

    }
}
