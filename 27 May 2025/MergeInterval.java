import java.util.Arrays;
import java.util.LinkedList;

public class MergeInterval {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        LinkedList<int[]> list = new LinkedList<>();
        
        for (int[] interval : intervals){
            if (list.isEmpty() || list.getLast()[1] < interval[0]){
                list.add(interval);
            }else {
                list.getLast()[1] = Math.max(list.getLast()[1], interval[1]);
            }
        }

         return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        int[][] ans = new MergeInterval().merge(intervals);

       for (int[] arr : ans){
        System.out.println(Arrays.toString(arr));
       }
    }

}