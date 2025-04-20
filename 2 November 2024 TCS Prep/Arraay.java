import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Arraay {

    public static int findSmallest(int[] arr) {

        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    public static int findLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static int getSum(int[] arr) {

        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // sum += arr[i];
        // }

        // return sum;
        // return IntStream.of(arr).sum();
        return Arrays.stream(arr).sum();
    }

    public static int findLargestRecrsively(int[] arr, int idx, int max) {
        if (idx == arr.length) {
            return max;
        }

        if (max < arr[idx]) {
            max = arr[idx];
        }

        return findLargestRecrsively(arr, idx + 1, max);
    }

    // Hashing
    public static Map<Integer, Integer> countFreq(int[] arr) {

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }

        return freqMap;
    }

    public static int getAverage(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 0 };

        System.out.println("Smallest Element => " + findSmallest(arr));
        System.out.println("Largest Element => " + findLargest(arr));
        System.out.println("Largest Element => " + findLargestRecrsively(arr, 0, Integer.MIN_VALUE));
        System.out.println("Sum => " + getSum(arr));
        System.out.println(countFreq(arr));
        System.out.println("Average => " + getAverage(arr));

    } 
}
