import java.util.Stack;

class DecodeString {

    public static String decode(String s) {

        Stack<Integer> numberStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        int n = 0;
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                numberStack.push(n);
                n = 0;
                stringStack.push(sb);
                sb = new StringBuilder();
            } else if (c == ']') {
                int k = numberStack.pop();
                StringBuilder temp = sb;
                sb = stringStack.pop();
                sb.append(String.valueOf(temp).repeat(k));
            } else {
                sb.append(c);
            }

        }

        return sb.toString();
    }
    

    public static void main(String[] args) {

       // decode("3[a2[c]]");

        System.out.println(decode("3[a2[c]]"));

    }
}