import java.util.ArrayList;

/**
 * ArrayLeaders
 */
public class ArrayLeaders {

    // Brute Force

    static ArrayList<Integer> leaders(int n, int arr[]) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (isLeader(i, arr)) {
                result.add(arr[i]);
            }
        }
        result.add(arr[arr.length - 1]);

        return result;
    }

    static boolean isLeader(int a, int[] arr) {

        boolean ans = true;
        for (int i = a; i < arr.length; i++) {
            if (arr[i] > arr[a]) {
                ans = false;
            }
        }
        return ans;
    }

    static ArrayList<Integer> leadersOptimized(int n, int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();

        int max_from_right = arr[n - 1];
        result.add(max_from_right);

        for (int i = n - 2; i >= 0; i--) {

            if (max_from_right < arr[i]) {
                max_from_right = arr[i];
                // result.add(arr[i]);
                result.add(0,max_from_right);
            }
        }

        return result;

    }

    public static void main(String[] args) {

        int[] arr = { 16, 17, 4, 3, 5, 2 };

        ArrayList<Integer> ans = leadersOptimized(6, arr);

        System.out.println(ans);

    }
}