public class InsertionSort {

    public void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public void recInsertionSort(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            j--;
        }

        recInsertionSort(arr, i + 1);

    }
}
