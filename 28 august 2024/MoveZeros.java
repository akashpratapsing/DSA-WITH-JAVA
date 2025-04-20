import java.util.Arrays;

/**
 * MoveZeros
 */
public class MoveZeros {

    static int countZero(int[] arr){

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        return count;
    }

    

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {

        int[] array = {10, 2, 0, 58, 0, 0, 58, 6, 87};

        int[] ans = moveZeros(array);

        System.out.println(Arrays.toString(ans));
        
    }
}