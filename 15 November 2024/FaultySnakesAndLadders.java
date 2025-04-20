import java.util.*;

public class FaultySnakesAndLadders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of snakes and ladders
        int N = sc.nextInt();
        Map<Integer, Integer> board = new HashMap<>();

        // Read the positions of snakes and ladders
        for (int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            board.put(start, end);
        }

        // Read dice rolls
        List<Integer> diceRolls = new ArrayList<>();
        while (sc.hasNextInt()) {
            diceRolls.add(sc.nextInt());
        }
        int targetPosition = diceRolls.remove(diceRolls.size() - 1); // The last input is the target position

        // Step 1: Check if the target is reachable without changes
        int finalPosition = simulatePath(diceRolls, board);
        if (finalPosition == targetPosition) {
            System.out.println("Not affected");
            return;
        }

        // Step 2: Try switching each snake or ladder
        for (Map.Entry<Integer, Integer> entry : board.entrySet()) {
            int start = entry.getKey();
            int originalEnd = entry.getValue();

            // Reverse the behavior: snake to ladder or ladder to snake
            board.put(start, 2 * start - originalEnd);
            int newPosition = simulatePath(diceRolls, board);

            // Check if the new behavior makes the target reachable
            if (newPosition == targetPosition) {
                if (originalEnd > start) {
                    System.out.println("Snake " + start + " " + originalEnd);
                } else {
                    System.out.println("Ladder " + start + " " + originalEnd);
                }
                return;
            }

            // Restore the original behavior
            board.put(start, originalEnd);
        }

        // Step 3: If no configuration works, print "Not reachable"
        System.out.println("Not reachable");
    }

    /**
     * Simulates the player's path on the board using the given dice rolls.
     * @param diceRolls List of dice rolls
     * @param board Map representing snakes and ladders
     * @return The final position reached
     */
    private static int simulatePath(List<Integer> diceRolls, Map<Integer, Integer> board) {
        int position = 1;

        for (int roll : diceRolls) {
            position += roll;
            if (position > 100) {
                position = 100; // Overshooting stops at 100
            }
            if (board.containsKey(position)) {
                position = board.get(position); // Follow snake/ladder
            }
        }

        // Ensure the position is stable (i.e., not on a snake or ladder)
        if (board.containsKey(position)) {
            return -1; // Unstable position
        }
        return position;
    }
}
