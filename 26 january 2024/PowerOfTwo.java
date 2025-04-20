/**
 * PowerOfTwo
 */
import java.util.*;
public class PowerOfTwo {

    static boolean isPowerOf2(int n){

        if (n == 0) {
            return false;
        }
        
        // String b = decToBin(n);
        // int count = 0;

        // for (int i = 0; i < b.length(); i++) {
        //     if (b.charAt(i) == '1') {
        //         count++;
        //     }
        // }

        // if (count == 1) {
        //     return true;
        // }else{
        //     return false;
        // }

      
        return (n & (n-1)) == 0;
    }
    static String decToBin(int n){

        String b = "";

        while (n >= 1) {
            int x = n % 2;
            b = x + b;
            n = n / 2;
        }

        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(isPowerOf2(n));
    }
}