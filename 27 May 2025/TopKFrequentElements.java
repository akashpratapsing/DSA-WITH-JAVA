import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    
    // Time Complexity O(n log k)
     public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : nums){
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
            (a, b) -> Integer.compare(b.getValue(), a.getValue())
        );

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
            heap.offer(entry);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++){
            res[i] = Objects.requireNonNull(heap.poll().getKey());
        }

        return res;
    }
}
