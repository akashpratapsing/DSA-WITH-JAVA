import java.util.ArrayList;
/**
 * ArrayDuplicates
 */
public class ArrayDuplicates {

    static ArrayList<Integer> findDup(int[] arr) {

        ArrayList<Integer> dup = new ArrayList<Integer>();

        int[] frequency = new int[arr.length];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 1) {
                dup.add(i);
                count++;
            }
        }

        if (count == 0) {
            dup.add(-1);
        }
        return dup;
    }

    static int findmax(int[] arr, int start, int end) {

        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findmin(int[] arr, int start, int end) {

        int min = arr[start];
        for (int i = start; i <= end; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = { 0, 3, 1, 2 };

        ArrayList<Integer> ans = findDup(array);

        


        int max = findmin(array, 0, 3);
        System.out.println(max);

        System.out.println(ans);
    }
}