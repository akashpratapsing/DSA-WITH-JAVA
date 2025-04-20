import java.util.*;

public class SnakesAndLaddersGraph {
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

        if (bfsReachable(1, targetPosition, diceRolls, board)) {
            System.out.println("Not affected");
            return;
        }

        for (Map.Entry<Integer, Integer> entry : board.entrySet()) {
            int start = entry.getKey();
            int originalEnd = entry.getValue();

            // Reverse its behavior
            board.put(start, 2 * start - originalEnd);
            if (bfsReachable(1, targetPosition, diceRolls, board)) {
                System.out.println((originalEnd > start ? "Snake" : "Ladder") + " " + start + " " + originalEnd);
                return;
            }

            // Restore original behavior
            board.put(start, originalEnd);
        }

        System.out.println("Not reachable");
    }

    private static boolean bfsReachable(int start, int target, List<Integer> diceRolls, Map<Integer, Integer> board) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        for (int roll : diceRolls) {
            int size = queue.size();
            Set<Integer> visited = new HashSet<>();

            while (size-- > 0) {
                int position = queue.poll();
                for (int next = position + 1; next <= position + 6 && next <= 100; next++) {
                    if (board.containsKey(next)) next = board.get(next);
                    if (!visited.contains(next)) {
                        visited.add(next);
                        queue.add(next);
                    }
                }
            }
        }

        return queue.contains(target);
    }
}

