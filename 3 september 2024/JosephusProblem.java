public class JosephusProblem {

    static int getPos(int n, int k) {
        if (n == 1) {
            return 0;
        }

        return (getPos(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {

        System.out.println(getPos(4, 2));
    }
}
