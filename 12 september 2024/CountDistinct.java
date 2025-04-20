import java.util.*;

public class CountDistinct {

    static int count(int[] arr) {
        Arrays.toString(arr);

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        return set.size();
    }

    public static void main(String[] args) {

        int[] arr = { 10, 10, 20, 30, 50, 20 };

        System.out.println(count(arr));

    }
}
