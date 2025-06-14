public class SelectionSort {

    public void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) { // Avoids unnecessary swaps
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

    }
}
