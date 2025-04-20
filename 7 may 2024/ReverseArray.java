/**
 * ReverseArray
 */
public class ReverseArray {


    static void print(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverse(int[] arr){
        int n = arr.length;

        int[] ans = new int[n];

        for (int i = n - 1; i >= 0 ; i--) {
            ans[n - i - 1] = arr[i];
        }

        print(ans);
    }

    static void reverse2(int[] arr){
        int  n = arr.length;

        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n-i-1] = temp;
        }

        print(arr);
    }


    public static void main(String[] args) {
        
        // int[] arr = {5, 8, 9, 1, 3, 66};

        // reverse2(arr);

       


    }
}