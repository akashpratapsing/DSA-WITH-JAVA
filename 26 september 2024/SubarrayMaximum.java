import java.util.*;

public class SubarrayMaximum {

    // static int[] getSubarrayMax(int[] arr, int k){

    // int[] result = new int[arr.length - k + 1];
    // int max = Integer.MIN_VALUE;
    // Queue<Integer> queue = new ArrayDeque<>();

    // for (int i = 0; i < k - 1; i++) {
    // if (max < arr[i]) {
    // max = arr[i];
    // queue.offer(max);
    // }
    // }
    // }

    public static void main(String[] args) {

        int[] arr = { 8, 44, 8, 8, 89, 85, 9, 0 };
        int k = 3;
        int[] result = new int[arr.length - k + 1];

        Deque<Integer> Qi = new LinkedList<Integer>();

        int i;
        for (i = 0; i < k; ++i) {

            while (!Qi.isEmpty()
                    && arr[i] >= arr[Qi.peekLast()])

                Qi.removeLast();

            Qi.addLast(i);
        }

        int index = 0;
        for (; i < arr.length; ++i) {

            result[index++] = arr[Qi.peek()];

            while ((!Qi.isEmpty()) && Qi.peek() <= i - k)
                Qi.removeFirst();

            while ((!Qi.isEmpty())
                    && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();

            Qi.addLast(i);
        }

        result[index++] = arr[Qi.peek()];


        System.out.println(Arrays.toString(result));

    }
}
