import java.util.Arrays;

public class Reverse {
    
    public static void reverseArray(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void recursiveReverse(int[] arr, int l, int r){
        if (l >= r){
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        recursiveReverse(arr, l + 1, r - 1);
        
    }
}
