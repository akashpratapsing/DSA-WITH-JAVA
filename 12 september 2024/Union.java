import java.util.*;

public class Union {

    static HashSet<Integer> getUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        return set;
    }

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 5 };
        int[] b = { 8, 6, 8, 1, 2, 3 };

        System.out.println(getUnion(a, b).toString());

    }
}
