import java.util.Arrays;

public class NumberOfGoodPairs {

    static int[] findPair(int[] nums){

        int[] ans = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    return new int[]{i, j};
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 3};

        int[] res = findPair(arr);

        System.out.println(Arrays.toString(res));


        
    }
}
