import java.util.Scanner;

/**
 * ReverseBits
 */
public class ReverseBits {

    static int  reverseBits(int n){
        int f = 31, l = 0;
        int rev = 0;

        while (f > l) {
            
            if ((n & (1 << f)) != 0) {
                rev = rev | (1 << l);
            }
            if ((n & (1 << l)) != 0) {
                rev = rev | (1 << f);
            }
            l++;
            f--;
        }
        return rev;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        System.out.println(reverseBits(n));
    }
}