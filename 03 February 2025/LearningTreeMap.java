import java.util.TreeMap;

class LearningTreeMap {

    public static void main(String[] args) {

        // Create a TreeMap of Strings (keys) and Integers (values)
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        
        treeMap.put(2, 10);
        treeMap.put(3, 10);


        treeMap.put(4, 5);
        treeMap.put(1 , 10);

        for (Integer key : treeMap.keySet()) { // O(n)
            System.out.println(
                "Key: " + key + ", Value: "
                + treeMap.get(key)); // O(log n) for each
                                     // get operation
        }

        // Displaying the TreeMap
        System.out.println("TreeMap elements: " + treeMap);
    }
}
