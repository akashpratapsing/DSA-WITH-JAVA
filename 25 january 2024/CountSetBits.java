import java.util.Scanner;

public class CountSetBits {

    // Brute Force Approach
    static int countSetBits(int n){

        String b = decToBin(n);
        int count=0;

        for (int i = b.length() - 1; i >= 0; i--) {
            if (b.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }

    static String decToBin(int n){
        
        String bin = "";

        while (n >= 1) {
            int x = n % 2;
            n /= 2;
            bin = x + bin;
        }
        return bin;
    }

    // Efficient Approach

    static int countSetBit(int n){

        int count = 0;

        while (n != 0) {
            n = (n & (n - 1));
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        System.out.println(countSetBit(n));
   }
}
