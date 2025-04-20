import java.util.*;

public class SnakesAndLaddersSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> board = new HashMap<>();

        // Read the snakes and ladders
        for (int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            board.put(start, end);
        }

        // Read the dice rolls
        List<Integer> diceRolls = new ArrayList<>();
        while (sc.hasNextInt()) {
            diceRolls.add(sc.nextInt());
        }
        int targetPosition = diceRolls.remove(diceRolls.size() - 1);

        // Try to trace backward
        if (backwardTrace(targetPosition, diceRolls, board)) {
            System.out.println("Not affected");
            return;
        }

        for (Map.Entry<Integer, Integer> entry : board.entrySet()) {
            int start = entry.getKey();
            int originalEnd = entry.getValue();

            // Reverse its behavior
            board.put(start, 2 * start - originalEnd);
            if (backwardTrace(targetPosition, diceRolls, board)) {
                System.out.println((originalEnd > start ? "Snake" : "Ladder") + " " + start + " " + originalEnd);
                return;
            }

            // Restore original behavior
            board.put(start, originalEnd);
        }

        System.out.println("Not reachable");
    }

    private static boolean backwardTrace(int target, List<Integer> diceRolls, Map<Integer, Integer> board) {
        Set<Integer> currentPositions = new HashSet<>();
        currentPositions.add(target);

        for (int i = diceRolls.size() - 1; i >= 0; i--) {
            Set<Integer> nextPositions = new HashSet<>();
            int roll = diceRolls.get(i);

            for (int pos : currentPositions) {
                for (int prev = pos - roll; prev >= 1 && prev > pos - 6; prev--) {
                    if (!board.containsKey(prev) || board.get(prev) != pos) {
                        nextPositions.add(prev);
                    }
                }
            }

            currentPositions = nextPositions;
        }

        return currentPositions.contains(1);
    }
}

