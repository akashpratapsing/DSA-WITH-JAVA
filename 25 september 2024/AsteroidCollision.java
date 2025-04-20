import java.util.ArrayDeque;
import java.util.Arrays;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {

        int currAst = asteroids.length - 1;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = asteroids.length - 2; i >= 0; i--) {
            if ((asteroids[currAst] > 0 && asteroids[i] < 0) ||
                    (asteroids[currAst] < 0 && asteroids[i] > 0)) {
                        if (Math.abs(asteroids[currAst]) < Math.abs(asteroids[i])) {
                            currAst = i;
                            stack.push(asteroids[currAst]);
                        }
            } else {
                stack.push(asteroids[currAst]);
                currAst = i;
            }
        }

        int[] ans = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            ans[index] = stack.peek();
            stack.pop();
            index++;
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] ass = {-2,-1,1,2};

        System.out.println(Arrays.toString(asteroidCollision(ass)));

    }
}
