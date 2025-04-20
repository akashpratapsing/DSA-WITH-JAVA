/**
 * TowerOfHanoi
 */
public class TowerOfHanoi {

    static void printMoves(int n, char a, char b, char c){
        if (n == 1) {
            System.out.println("Move 1 from " + a + " to " + c);
            return;
        }


        printMoves( n - 1, a, c, b);
        System.out.println("Move " + n + " from " + a + " to " + c);
        printMoves( n - 1, b, a, c);
    }

    public static void main(String[] args) {
        int n = 4; // number of disks

        printMoves(n, 'A', 'B', 'C');
    }
}