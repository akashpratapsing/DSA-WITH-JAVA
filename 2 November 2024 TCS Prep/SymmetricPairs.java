import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class SymmetricPairs {

    // Brute Force Approach
    public static List<List<Integer>> findSymPairs(int[][] arr) {
        int rows = arr.length;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]) {
                    list.add(arr[i][0]);
                    list.add(arr[i][1]);
                }
            }
            ans.add(list);
        }

        return ans;
    }

    // Optimized Approach : Using Hashmap
    public static List<List<Integer>> findSymPair(int[][] arr) {
        int rows = arr.length;
        List<List<Integer>> ans = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> list = new ArrayList<>();

            int first = arr[i][0];
            int second = arr[i][1];

            Integer value = map.get(second);

            if (value != null && value == first) {
                list.add(second);
                list.add(first);
                ans.add(list);
            } else {
                map.put(first, second);
            }
        }

        return ans;
    }
}