import java.util.Arrays;

class Sort {

    static void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

   // Sorts in decending order
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int lastIdx = arr.length - i - 1;
            int maxIdx = getMax(arr, 0, lastIdx);
            swap(arr, lastIdx, maxIdx);

        }
    }

    static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = true;
                }
            }
            if (!flag)
                break;
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int getMax(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i < end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] array = { 2, 8, 6, 1, 9, 1, 36, 9 };

        System.out.println(Arrays.toString(array));

        // bubbleSort(array);
        // selectionSort(array);
         insertionSort(array);
      //  insertion(array);

        System.out.println(Arrays.toString(array));

    }
}