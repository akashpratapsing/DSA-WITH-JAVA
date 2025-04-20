public class BitwiseOperators {

    public static boolean isPowerofTwo(long n) {

        // Your code here
        
       long x = 1;
        
        while (x <= n){
            
            if ((n ^ x) == 0){
                return true;
            }
            
            x = x << 1;
            //n =  n >> 1;
        }
        
        return false;
    }

    static void oddEven(int n) {

        if ((n & 1) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }


    static int numberWhichAppearOnce(int[] arr){

        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result ^= arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        oddEven(5);

        // int[] arr = {1, 2, 2, 3, 6, 6, 4, 3, 4};

        // int ans = numberWhichAppearOnce(arr);
        // System.out.println(ans);

        System.out.println(isPowerofTwo(32));

    }
}
