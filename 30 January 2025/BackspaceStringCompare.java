import java.util.Scanner;
import java.util.Stack;

public class BackspaceStringCompare {

    public static String removeWrongChar(String str){

        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }else{
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : stack) {
            sb.append(character);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String bob = sc.nextLine();
        String alice = sc.nextLine();
        sc.close();

        bob = removeWrongChar(bob);
        alice = removeWrongChar(alice);

        if (bob.equals(alice)) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    

      
    }


}