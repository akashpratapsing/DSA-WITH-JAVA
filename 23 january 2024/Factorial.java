import java.util.Scanner;

/**
 * Factorial
 */
public class Factorial {


    static int fact(int n){
        if (n == 0 ){
           return 1;
        }
        int res = 1;
        for (int i = 1; i <= n; i++) {
           res *= i;
        }

        return res;
   }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        System.out.println(fact(n));
    }
}