import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatingElement {
    

    // Brute Force Approach
    public static int firstNonRepElement(int[] arr){

        for (int i = 0; i < arr.length; i++) {
           boolean flag = false;
            for (int j = 0 ; j < arr.length; j++) {     
                if (arr[i] == arr[j] && i != j) {
                    flag = true;
                }
            }
            if (flag == false) {
                return arr[i];
            }
        }
        return 0;
    }

    // Optimized Approach using Hashing
    public static int firstNonRepElementOptimized(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                return arr[i];
            }
        }

        // for (Map.Entry<Integer, Integer> entry: map.entrySet()){
        //     if (entry.getValue() == 1) {
        //         return entry.getKey();
        //     }
        // }
        return 0;
    }

}
