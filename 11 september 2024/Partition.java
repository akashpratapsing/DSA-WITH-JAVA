import java.util.Arrays;

public class Partition {

    static void naive(int[] arr, int l, int h, int pivot) {
        int[] temp = new int[h - l + 1];
        int index = 0;

        for (int i = l; i <= h; i++) {
            if (arr[i] <= arr[pivot] && i != pivot) {
                temp[index] = arr[i];
                index++;
            }
        }
        temp[index++] = arr[pivot];
        for (int i = l; i <= h; i++) {
            if (arr[i] > arr[pivot]) {
                temp[index] = arr[i];
                index++;
            }
        }

        for (int i = l; i < temp.length; i++) {
            arr[i] = temp[i - l];
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

    public static void main(String[] args) {

        int[] arr = { 100, 90, 70, 80, 60, 10 };

        System.out.println(Arrays.toString(arr));

        // naive(arr, 0, arr.length - 1, 4);
        // lomutoPartition(arr, 0, arr.length - 1);
        hoarePartition(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }
}