import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = { 1, 88, 5, 86, 25, 48, 3, 322, 6, 52 };

        // new BubbleSort().bubbleSort(arr);
        // new SelectionSort().selectionSort(arr);
        new InsertionSort().recInsertionSort(arr, 0);;

        System.out.println(Arrays.toString(arr));
    }
}
