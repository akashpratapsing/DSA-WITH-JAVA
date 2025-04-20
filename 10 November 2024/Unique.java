import java.util.Arrays;

public class Unique {

    public static int minimumIncrements(int[] arr) {

        Arrays.sort(arr);
        
        int countInc = 0;
        for (int i = 1; i < arr.length; i++){
            
            if (arr[i] <= arr[i - 1]){
                countInc +=  arr[i - 1] - arr[i] + 1;
                arr[i]  = arr[i - 1] + 1; // After Simplification of -> arr[i] + arr[i - 1] - arr[i] + 1;
            }
        }
            
        return countInc;
    }

}
