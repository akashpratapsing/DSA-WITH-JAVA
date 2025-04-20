import java.util.HashMap;

public class LongestSubarray {

    public static int longestSubarray(int n, int[] arr) {

        int max = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = 0;
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                count++;
                if (sum == count && max < count && count <= arr.length) {
                    max = count;
                }

            }
        }
        return max;
    }

    // Just copied from chatgpt
     public static int longestSubarray1(int n, int[] arr) {
        // HashMap to store the sum of elements up to each index
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        // Initialize sum and maxLength
        int sum = 0, maxLength = -1;
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            
            // If the sum equals the current index + 1, update maxLength
            if (sum == i + 1) {
                maxLength = i + 1;
            }
            
            // If (sum - (i + 1)) is in the HashMap, update maxLength
            if (sumIndexMap.containsKey(sum - (i + 1))) {
                int subarrayLength = i - sumIndexMap.get(sum - (i + 1));
                if (subarrayLength > maxLength) {
                    maxLength = subarrayLength;
                }
            }
            
            // If the sum is not already in the HashMap, add it
            if (!sumIndexMap.containsKey(sum)) {
                sumIndexMap.put(sum, i);
            }
        }
        
        return maxLength;
    }
    public static void main(String[] args) {

        int[] arr = { 33, -7, -23, -55, 12, 31, 12, 70, 43, -2, -21, -83, 32, 69, -84, 73, -11, -82, 47, -98, 23, 89,
                90, -44, 16, -54, 10, 38, 18, 99, -25, -62, 61, 36, -79, 41, 49, -56, 3, -87, 93, 68, 3, -2, 93, -12,
                23, -71, 33, 47, 39, -38, 25, -23, 0, 24, -30, -56, -51, -74, -64, 5, 12, -10, 34, 89, 49, -18, -50,
                -71, -50, -68, 41, 72, -13, -21, -79, -38, 52, 14, 60, -82, -89, 88, -62, 14, 29, -73, 100, 6 };

        System.out.println(longestSubarray(arr.length, arr));

    }
}
