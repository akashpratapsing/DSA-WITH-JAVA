import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter column: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter Elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("--------------------------");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        int[][] rotatedMatrix = rotate(matrix, row, col);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] rotate(int[][] matrix, int row, int col) {

        int[][] ans = new int[row][col];

        int pointer2 = 0;
        for (int i = 0; i < ans.length; i++) {
            int pointer1 = row - 1;   
            for (int j = 0; j < ans.length; j++) {
                ans[i][j] = matrix[pointer1][pointer2];
                pointer1--;
            }
            pointer2 = pointer2 + 1;
        }

        return ans;
    }
}
