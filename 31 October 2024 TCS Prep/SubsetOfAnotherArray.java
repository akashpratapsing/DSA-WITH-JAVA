import java.util.*;
public class SubsetOfAnotherArray {

    // Brute Force Approach
    public static boolean isSubset(int[] arr1, int[] arr2) {

        for (int i = 0; i < arr2.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) return false;
        }

        return true;
    }

    // Optimized Approach : Hashing
    public static boolean isSubset2(int[] arr1, int[] arr2){

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (!set.contains(arr2[i])) {
                return false;
            }
        }

        return true;
    }
}

