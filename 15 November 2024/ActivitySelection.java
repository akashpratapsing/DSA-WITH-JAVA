import java.util.*;

class MyComparator implements Comparator<int[]>{

    @Override
    public int compare(int[] o1, int[] o2) {
       return o1[1] - o2[0];
    }

}

public class ActivitySelection {
   
    static int selectMaxActivity(int[][] arr){

        Arrays.sort(arr, new MyComparator());
        int result = 1;
        int prev = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1] >= arr[prev][1]){
                result++;
                prev = i;
            }
            
        }
        return result;
    }
}
