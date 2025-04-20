import java.util.ArrayDeque;
import java.util.Arrays;

class StockSpan {

    // Brute Force
    static int[] getSpan(int[] arr) {

        int[] spans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int span = 1;
            for (int j = i; j > 0 && arr[i] > arr[j - 1]; j--) {
                span++;
            }
            spans[i] = span;
        }

        return spans;
    }

    static int[] getSpan2(int[] arr) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] spans = new int[arr.length];

        spans[0] = 1;
        stack.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            spans[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        return spans;
    }

    public static void main(String[] args) {
        int[] prices = { 6, 5, 4, 3, 2, 1 ,55};

        System.out.println(Arrays.toString(getSpan2(prices)));
    }
}