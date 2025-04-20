public class SubarraySum {

    public static int maxSubarraySumOfSizeK(int[] arr, int k){

        int start = 0;
        int end = 0;

        int sum = 0;
        int maxSum = 0;

        while (end < arr.length) {
            sum += arr[end];
            if (end - start + 1 < k) {              
                end++;
            }else if (end - start + 1 == k) {
                maxSum = Math.max(sum, maxSum);
                sum -= arr[start];
                start++;
                end++;
            }
          
        }

        return maxSum;

    }
    
    public static void main(String[] args) {
        
        int arr[] = {5,2,9,50,7,32,77,5,1};

        System.out.println(maxSubarraySumOfSizeK(arr, 2));

    }
}
