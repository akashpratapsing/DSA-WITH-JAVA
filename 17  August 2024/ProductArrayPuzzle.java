import java.io.*;
import java.util.*;

class ProductArrayPuzzle {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            t--;
        }
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
    public static long[] productExceptSelf(int nums[]) {
        // code here

        long[] ans = new long[nums.length];

        if (nums.length == 1) {
            ans[0] = 1;
            return ans;
        }

        if (nums.length == 2) {
            ans[0] = nums[1];
            ans[1] = nums[0];

            return ans;
        }

        int count = countZeros(nums);
        int prod = 1;

        if (count == 0) {

            for (int i = 0; i < nums.length; i++) {
                prod *= nums[i];
            }

            for (int i = 0; i < ans.length; i++) {
                ans[i] = prod / nums[i];
            }

            return ans;

        } else if (count == 1) {

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    continue;
                } else {
                    prod *= nums[i];
                }
            }

            for (int i = 0; i < ans.length; i++) {
                if (nums[i] == 0) {
                    ans[i] = prod;
                } else {
                    ans[i] = 0;
                }
            }

            return ans;
        } else {

            return ans;
        }

    }

    static int countZeros(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }

        return count;
    }
}
