import java.util.*;

class Difference {

    public static void main(String[] args) {

        int[] num1 = { 1, 2, 3, 3 };
        int[] num2 = { 1, 1, 2, 2 };

        // solution

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

    
        for (int i = 0; i < num2.length; i++) {
            set2.add(num2[i]);
        }

        for (int i = 0; i < num1.length; i++) {

            if (set2.contains(num1[i])) {
                continue;
            }
            set1.add(num1[i]);
        }

        for (int i = 0; i < num1.length; i++) {
            if (set2.contains(num1[i])) {
                set2.remove(num1[i]);
            }
        }

        // List<List<Integer>> list = new ArrayList<>();

        // List<Integer> list1 = new ArrayList<>();
        // for (Integer integer : set1) {
        //     list1.add(integer);
        // }

        // List<Integer> list2 = new ArrayList<>();
        // for (Integer integer : set2) {
        //     list2.add(integer);
        // }

        // list.add(list1);
        // list.add(list2);

        List<List<Integer>> list =  Arrays.asList(new ArrayList<>(set1), new ArrayList<>(set2));


        System.out.println(list);

    }
}