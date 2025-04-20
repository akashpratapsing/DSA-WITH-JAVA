import java.util.Arrays;

/**
 * RecursionSort
 */
public class RecursionSort {

    static void bubbleSort(int[] arr, int index, int pass) {
        if (pass == 0) {
            return;
        }

        if (index < pass) {

            if (arr[index] > arr[index + 1]) {
                int temp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;
            }

            bubbleSort(arr, index + 1, pass);
        } else {
            bubbleSort(arr, 0, pass - 1);
        }
    }

    static void selectionSort(int[] arr, int index, int pass, int max) {
        if (pass == 0) {
            return;
        }

        if (index < pass) {
            if (arr[max] < arr[index]) {
                max = index;
            }
            selectionSort(arr, index + 1, pass, max);
        } else {

            int temp = arr[max];
            arr[max] = arr[pass - 1];
            arr[pass - 1] = temp;

            selectionSort(arr, 0, pass - 1, 0);
        }
    }

    static void print(int r, int c) {

        if (r == 0) {
            return;
        }

        if (c < r) {
            System.out.print("* ");
            print(r, c + 1);
        } else {
            System.out.println();
            print(r - 1, 0);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 4, 2, 3, 856, 5, 991, 0 };

        System.out.println(Arrays.toString(arr));

        // bubbleSort(arr, 0, arr.length - 1);
        selectionSort(arr, 0, arr.length, 0);

        System.out.println(Arrays.toString(arr));
        // print(5, 0);

        

    }
}