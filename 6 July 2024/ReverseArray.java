import java.util.Arrays;

public class ReverseArray {

    static int[] reverse(int[] arr){

        int start = 0;
        int end = arr.length - 1;
        int temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }


        return arr;
           
        
    }
    public static void main(String[] args) {
        

        int[] arr = {5, 2, 8, 9, 8};

        int[] res = reverse(arr);

        System.out.println(Arrays.toString(res));
    }
}
