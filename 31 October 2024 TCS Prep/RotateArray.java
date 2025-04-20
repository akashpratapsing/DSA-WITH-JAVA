public class RotateArray {

    // Naive Approach
    public static void rotate(int[] arr, int n) {
        n %= arr.length;
        while (n != 0) {
            rotateByOne(arr);
            n--;
        }
    }

    public static void rotateByOne(int[] arr) {
        int n = arr.length;
        int last = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = last;
    }

    // Using Extra Space
    public static void rotateWithExtraSpace(int[] arr, int n){
        int len = arr.length;
        int[] temp = new int[len];
        n %= len;

        int index = 0;

        for (int i = len - n; i < len; i++){
            temp[index++] = arr[i];
        }

        for (int i = 0; i < len - n; i++) {
            temp[index++] = arr[i];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }

    // Using Reversal Method
    public static void rotateOptimized(int[] arr, int n){
        int len = arr.length;
        n %= len;

        reverse(arr, 0, len - n - 1);
        reverse(arr, len - n, len - 1);
        reverse(arr, 0, len - 1);
    }
     
    public static void reverse(int[] arr, int start, int end){

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
