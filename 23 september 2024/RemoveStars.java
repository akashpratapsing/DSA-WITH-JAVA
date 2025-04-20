import java.util.ArrayDeque;

public class RemoveStars {
    public static void main(String[] args) {

        String str = "erase***";

        ArrayDeque<Character> stack = new ArrayDeque<>();
        int countStar = 0;
        StringBuilder ans = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // while (!stack.isEmpty()) {

        //     while (stack.peek() == '*') {
        //         countStar++;
        //         stack.pop();
        //     }

        //     while (countStar != 0 && !stack.isEmpty()) {
        //         stack.pop();
        //         countStar--;
        //     }

        //     if (!stack.isEmpty() &&stack.peek() != '*') {
        //         ans.append(stack.peek());
        //         stack.pop();
        //     }
        // }

        System.out.println("Result String : " + ans.reverse());

        System.out.println(stack.size());

        for (;!stack.isEmpty();) {
            stack.pop();
        }

        System.out.println(stack.size());
    }
}
