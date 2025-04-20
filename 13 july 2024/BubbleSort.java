import java.util.Arrays;

/**
 * BubbleSort
 */
public class BubbleSort {

    static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void rotate(int[] arr) {
        // code here
        int temp = arr[arr.length - 1];
        
        for (int i = arr.length - 1; i > 0; i--){
            
            arr[i] = arr[i - 1];
        }
        
        arr[0] = temp;

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {

        int[] arrr = { 999, -89, 250, 2, -9, 253, 1, 5, 55, -968, 856 };

      //  System.out.println(Arrays.toString(sort(arrr)));

      rotate(arrr);
      
    }
}