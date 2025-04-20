import java.util.Arrays;

public class MergeSort {

    static void mergeSort(int[] arr, int l, int r) {

        if (l < r) {

            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    static int[] merge(int[] arr, int low, int mid, int high) {

        int[] left = new int[mid - low + 1];
        int[] right = new int[high - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[low + i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;

        while (i < left.length && j < right.length) {
            if (left[i] > right[j]) {
                arr[k] = right[j];
                j++;
                k++;
            } else {
                arr[k] = left[i];
                i++;
                k++;
            }
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = { 8858, 785, 144, 8, 9, 1, 2, 3, 4, 88, 0, 896 };

        // int[] result = merge(arr, 0, 4, 8);
        mergeSort(arr, 0, 11);

        // System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(arr));

    }
}
