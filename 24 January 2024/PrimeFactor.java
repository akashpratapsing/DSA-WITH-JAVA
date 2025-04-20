import java.util.Scanner;

public class PrimeFactor {


    static void primeFactor(int n){
        int i = 2;

        while ( i * i <= n ) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
            i++;
        }

        if (n > 1) {
            System.out.println(n);
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        primeFactor(n);
    }
}
