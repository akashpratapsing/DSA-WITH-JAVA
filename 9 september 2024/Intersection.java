public class Intersection {

    static void intersectionOfTwoSortedArray(int[] a, int[] b) {
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }

            if (a[i] > b[j]) {
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] a = { 1, 1, 1, 1, 2, 3, 4, 5, 5, 7, 8 };
        int[] b = { 7, 8 };

        intersectionOfTwoSortedArray(a, b);

    }
}
