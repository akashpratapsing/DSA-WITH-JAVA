import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NearestSmallest {

    public static ArrayList<Integer> toRight(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = array.length - 1; i >= 0; i--) {

            if (stack.isEmpty()) {
                result.add(-1);
            } else if (!stack.isEmpty() && stack.peek() < array[i]) {
                result.add(stack.peek());
            } else if (!stack.isEmpty() && stack.peek() >= array[i]) {
                while (!stack.isEmpty() && stack.peek() >= array[i]) {
                    stack.pop();
                }

                if (stack.isEmpty()) {
                    result.add(-1);
                }else{
                    result.add(stack.peek());
                }
            }
            stack.push(array[i]);
        }

        Collections.reverse(result);
        return result;
    }

    public static ArrayList<Integer> toLeft(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            
            if (stack.isEmpty()) {
                result.add(-1);
            }else if (!stack.isEmpty() && stack.peek() < array[i]){
                result.add(stack.peek());
            }else if (!stack.isEmpty() && stack.peek() >= array[i]){
                while (!stack.isEmpty() && stack.peek() >= array[i]) {
                    stack.pop();
                }

                if (stack.isEmpty()) {
                    result.add(-1);
                }else {
                    result.add(stack.peek());
                }
            }
            stack.push(array[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = { 7, 8, -8, 1, 19, 3 };

        System.out.println("Nearest Smaller to Right => " + toRight(arr));
        System.err.println("Nearest Smaller to Left => " + toLeft(arr));

    }
}
