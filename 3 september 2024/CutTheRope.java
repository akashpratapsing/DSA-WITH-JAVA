/**
 * CutTheRope
 */
public class CutTheRope {

    static int maxPeaces(int n, int a, int b, int c) {

        if (n == 0){
            return 0;
        }
        if (n < 0) {
            return -1;
        }

        int res = Math.max(maxPeaces(n - a, a, b,c),
                (Math.max(maxPeaces(n - b, a, b, c),
                        maxPeaces(n - c, a, b, c))));

        if (res == -1) {
            return -1;
        }

        return res + 1;
    }

    public static void main(String[] args) {

        System.out.println(maxPeaces(23, 11, 9, 12));
        
    }
}