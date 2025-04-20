import java.util.Scanner;

public class GcdOfTwoNumbers {

    static int gcd(int a, int b) {

       // int min = (a < b) ? (min = a) : (min = b);

       int min = Math.min(a, b);
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }


    static int euclidGcd(int a, int b){

       while (a != b) {
        if (a>b) {
            a = a-b;
        }else{
            b = b-a;
        }
       }
       return a;
    }

    static int optimalEuclidGcd(int a, int b){

        while (a != 0 && b != 0) {
            if (a>b) {
                a = a%b;
            }else{
                b = b%a;
            }
           }

           if (a != 0) {
            return a;
           }else{
            return b;
           }
           

    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(optimalEuclidGcd(a, b));

    }
}
