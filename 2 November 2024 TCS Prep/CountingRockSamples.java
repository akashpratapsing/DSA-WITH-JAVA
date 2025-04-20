import java.util.ArrayList;
import java.util.List;

public class CountingRockSamples {
    
    // Brute Force
    public static List<Integer> countSamples(int[] arr, int[][] ranges){
        List<Integer> result = new ArrayList<>();
        

        for (int i = 0; i < ranges.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] <= ranges[i][1] && arr[j] >= ranges[i][0]) {
                    count++;
                }
            }
            result.add(count);
        }

        return result;
    }
}
