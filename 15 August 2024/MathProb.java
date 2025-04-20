public class MathProb {

    static int gcd(int a, int b) {

        int i = Math.min(a, b);
        while (i > 0) {
            if ((a % i) == 0 && (b % i) == 0) {
                break;
            }
            i--;
        }

        return i;
    }

    static int uclid(int a, int b) {

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }

    static int euclid(int a, int b) {

        while (a != b) {
            if (a > b) {
                a = a % b;
                if (a == 0) {
                    return b;
                }
            } else {
                b = b - a;
                if (b == 0) {
                    return b;
                }
            }
        }

        return a;
    }

    static int lcm(int a, int b) {

        int lcm = Math.max(a, b);

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm++;
        }

        return lcm;
    }

    static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if ((n % i == 0) || (n % (i + 2) == 0)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // System.out.println(gcd(15, 5));
        // System.out.println(uclid(15, 5));
        // System.out.println(euclid(15, 5));

        // System.out.println(lcm(20, 15));
        System.out.println(isPrime(101));

    }
}
