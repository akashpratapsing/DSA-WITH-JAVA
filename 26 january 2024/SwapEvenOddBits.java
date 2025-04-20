import java.util.Scanner;

public class SwapEvenOddBits {

    static int swapEvenOddBits(int n){

        return ((n &  0xaaaaaaaa) >>> 1) | ((n & 0x55555555) << 1);
    }
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(swapEvenOddBits(n));
    }
}
