import java.util.Scanner;

public class TrailingZInBinary {

    static int countTZ(int n){
        if (n == 0) {
            return -1;
        }
        return (int)(Math.log10( n ^ (n & n-1)) / Math.log10(2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(countTZ(n));
    }
}
