public class Union {

    static void union(int[] a, int[] b) {
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {

            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }

            if (a[i] > b[j]) {
                System.out.print(b[j] + " ");
                j++;
            } else if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }

        while (i < a.length) {
            if (i > 0 && a[i] != a[i - 1]) {
                System.err.print(a[i] + " ");
                i++;
            }
        }

        while (j < b.length) {
            if (j > 0 && b[j] != b[j - 1]) {
                System.err.print(b[j] + " ");
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] a = { 2, 3, 3, 4, 5, 6, 6, 6, 7 };
        int[] b = { 1, 7, 8 };

        union(a, b);

    }
}
