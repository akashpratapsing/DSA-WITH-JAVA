import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else if (isPair(c, stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public boolean isPair(char ch1, char ch2) {
        return (ch1 == '}' && ch2 == '{') ||
                (ch1 == ']' && ch2 == '[') ||
                (ch1 == ')' && ch2 == '(');
    }
}
