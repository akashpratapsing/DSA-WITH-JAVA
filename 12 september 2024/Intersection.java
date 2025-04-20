import java.util.*;


public class Intersection {

    public static List<Integer> getIntersection(int[] arr1, int[] arr2){

    HashSet<Integer> set = new HashSet<>();

    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < arr2.length; i++) {
        set.add(arr2[i]);
    }

    for (int i = 0; i < arr1.length; i++) {
        if (set.contains(arr1[i])) {
            result.add(arr1[i]);
        }
    }
   

    return result;
}
    public static void main(String[] args) {
        
        int[] a = { 1, 2, 3, 5 , 8};
        int[] b = { 8, 6, 8, 1, 5};

        System.out.println(getIntersection(a,b).toString());
    }
}
