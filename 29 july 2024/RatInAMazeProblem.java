import java.util.ArrayList;

public class RatInAMazeProblem {

    public static String findPath(int[][] mat) {

        int rows = mat.length;

        if (mat[rows - 1][rows - 1] == 0) {
            return "";
        }

        int i = 0, j = 0;
        int pointer = mat[i][j];
        String ans = "";

        while (pointer != mat[rows - 1][rows - 1]) {

            if (mat[i][j + 1] == 1) {
                // For Right
                pointer = mat[i][j + 1];
                ans += "R";
            } else if (mat[i + 1][j] == 1) {
                // For Down
                pointer = mat[i + 1][j];
                ans += "D";
            } else if (mat[i][j - 1] == 1) {
                // For Left
                pointer = mat[i][j - 1];
                ans += "L";
            } else {
                // For Up
                pointer = mat[i - 1][j];
                ans += "U";
            }

        }

        return ans;
    }

   

    public static void main(String[] args) {

        int mat[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 } };

        System.out.println(findPath(mat));

    }
}
