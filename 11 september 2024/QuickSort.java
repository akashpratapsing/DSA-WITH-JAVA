import java.util.*;

public class QuickSort {

    static void qLSort(int[] arr, int l, int h) {

        if (l < h) {

            int p = lomutoPartition(arr, l, h);
            qLSort(arr, l, p - 1);
            qLSort(arr, p + 1, h);
        }
    }

    static int lomutoPartition(int[] arr, int l, int h) {

        int pivot = h;
        int i = l - 1;

        for (int j = l; j < h; j++) {
            if (arr[j] < arr[pivot]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[pivot];
        arr[pivot] = temp;

        return i + 1;
    }

    static int hoarePartition(int[] arr, int l, int h) {
        int pivot = l;
        int i = l - 1;
        int j = h + 1;

        while (true) {
            do {
                i++;
            } while (arr[i] < arr[pivot]);
            do {
                j--;
            } while (arr[j] > arr[pivot]);
            if (j <= i) {
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    static void qHSort(int[] arr, int l, int h) {

        if (l < h) {

            int p = hoarePartition(arr, l, h);
            qHSort(arr, l, p);
            qHSort(arr, p + 1, h);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 7, 8, 2, 9, 36, 1, 85 };
        System.out.println(Arrays.toString(arr));

        // qLSort(arr, 0, arr.length - 1);
        qHSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
