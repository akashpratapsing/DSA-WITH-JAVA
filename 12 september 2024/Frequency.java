import java.util.*;

public class Frequency {

    static HashMap<Integer, Integer> getFreq(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (freq.containsKey(arr[i])) {
                int count = freq.get(arr[i]).intValue();
                freq.put(arr[i], count + 1);
            } else {
                freq.put(arr[i], 1);
            }
        }

        return freq;
    }

    public static void main(String[] args) {

        int[] arr = { 10, 10, 10, 20, 5, 20, 8, 69 };

        System.out.println(getFreq(arr).toString());

    }
}
