import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // int[][] arr = { { 11, 20 }, { 30, 40 }, { 5, 10 }, { 40, 30 }, { 10, 5 } };

        // System.out.println(SymmetricPairs.findSymPair(arr));

        int samples[] = { 400, 567, 890, 765, 987 };
        int[][] ranges = { { 300, 380 }, { 800, 1000 } };

        // System.out.println(CountingRockSamples.countSamples(samples, ranges));
        // Reverse.reverseArray(samples);
        Reverse.recursiveReverse(samples, 0, samples.length - 1);
        System.out.println(Arrays.toString(samples));

    }
}
