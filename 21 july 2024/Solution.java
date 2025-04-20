import java.util.ArrayList;
import java.util.Arrays;

// GFG Weekly Contest: Question 2: Bob's Game
public class Solution {

    public static int[] removeOrder(int n, int[] arr, String str) {
   
        int[] ans = new int[n];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < n; i++) {

            //Find minimum number from list if str(i) = 0 else find maximum number
            if (str.charAt(i) == '0') {
                int min = findmin(list);
                ans[i] = list.get(min);
                list.remove(min);
            } else {
                int max = findmax(list);
                ans[i] = list.get(max);
                list.remove(max);
            }
        }
        return ans;
    }

    // Find the index of maximum number
    static int findmax(ArrayList<Integer> arr) {

        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(max) < arr.get(i)) {
                max = i;
            }
        }
        return max;
    }

    // Find the index of minimum number
    static int findmin(ArrayList<Integer> arr) {

        int min = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(min) > arr.get(i)) {
                min = i;
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int n = 4;
        int[] arr = { 7, 5, 11, 3 };
        String str = "0110";

        int[] result = removeOrder(n, arr, str);

        System.out.println(Arrays.toString(result));

    }
}
