import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurence {

    static boolean isUniqeOccr(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (set.contains(entry.getValue())) {
                return false;
            } else {
                set.add(entry.getValue());
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr = { -3, 0, 1, -3, 1, 1, -3, 10, 0 };

        System.out.println(isUniqeOccr(arr));

    }
}
