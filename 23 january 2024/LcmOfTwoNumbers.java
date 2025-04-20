import java.util.Scanner;

public class LcmOfTwoNumbers {

    static int lcm(int a, int b) {

        // int max = Math.max(a, b);

        // while (true) {
        // if(max % a ==0 && max % b == 0){
        // break;
        // }
        // max++;
        // }
        // return max;

        return (a * b) / optimalEuclidGcd(a, b);
    }

    static int optimalEuclidGcd(int a, int b) {

        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a != 0) {
            return a;
        } else {
            return b;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(lcm(a, b));
    }
}
