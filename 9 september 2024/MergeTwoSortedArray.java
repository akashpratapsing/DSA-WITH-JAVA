import java.util.Arrays;

public class MergeTwoSortedArray {

    static int[] merge(int[] a, int[] b) {

        int[] arr = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                arr[k] = b[j];
                k++;
                j++;
            } else {
                arr[k] = a[i];
                i++;
                k++;
            }
        }

        while (i < a.length) {
            arr[k] = a[i];
            k++;
            i++;
        }

        while (j < b.length) {
            arr[k] = b[j];
            k++;
            j++;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] array1 = { 8, 16, 55, 99 };
        int[] array2 = { 10, 12, 15, 20 };

        int[] result = merge(array1, array2);

        System.out.println(Arrays.toString(result));

    }
}
