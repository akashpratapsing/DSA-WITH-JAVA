import java.util.Arrays;

public class RearrangeArray {
    
    public static void rearangeAcendingDecending(int[] arr){
        Arrays.sort(arr);

        int n = arr.length;

        int start = n/2;
        int end = n - 1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
