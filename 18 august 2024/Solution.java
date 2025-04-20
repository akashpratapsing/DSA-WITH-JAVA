//{ Driver Code Starts
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");

            int[] arr = new int[s.length];
            for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(s[i]);

            Solution obj = new Solution();
            boolean res = obj.canSplit(arr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        
        int sum1 = 0;
        int sum2 = 0;
        
        for (int i = 0; i < arr.length; i++){
            sum1 += arr[i];
        }
        
         for (int i =  arr.length - 1; i >= 0; i--){
             
             if (sum1 - sum2 == 0){
                 return true;
             }else {
                 sum1 -= arr[i];
                 sum2 += arr[i];
             }
        }
        
        return false;
        
    }
}
