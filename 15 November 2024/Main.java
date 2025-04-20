public class Main {

    public static void main(String[] args) {

        int[][] array = new int[][] { { 5, 6 }, { 1, 2 }, { 7, 6 }, { 3, 4 }, { 8, 9 } };

        int ans = ActivitySelection.selectMaxActivity(array);

        System.out.println(ans);

    }
}