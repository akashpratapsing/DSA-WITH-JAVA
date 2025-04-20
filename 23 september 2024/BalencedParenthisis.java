import java.util.ArrayDeque;

public class BalencedParenthisis {


    static boolean isBalenced(String str){

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
           if (x == '(' || x == '{' || x == '[' ) {
            stack.push(x);
           }else{
            if (stack.isEmpty()) {
                return false;
            }else if (match(stack.peek(), x)) {
                stack.pop();
            }else {
                return false;
            }
           }
        }

        return stack.isEmpty();
    }

    static boolean match(char a, char b){
        return ((a == '(' && b == ')') ||
        (a == '{' && b == '}') ||
        (a == '[' && b == ']'));
    }
    public static void main(String[] args) {

        String s = "()";

        System.out.println(isBalenced(s));
        
    }
}
