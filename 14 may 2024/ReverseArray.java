/**
 * ReverseArray
 */
public class ReverseArray {

    public static void print(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        print(arr);
    }

    public static void main(String[] args) {
        
        int[] arr = {5, 4, 3, 2, 1};

        print(arr);
        reverse(arr);
       
    }
}