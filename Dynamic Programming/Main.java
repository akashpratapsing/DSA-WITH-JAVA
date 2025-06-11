import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Fibonacci f = new Fibonacci();

        // int res = f.nthFibo(6);

        int n = 6;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        // int res = f.fibo(n, dp);
        // int res = f.fiboTabulation(n);
        int res = f.fiboTabulation2(n);
        System.out.println(res);

    }
}
