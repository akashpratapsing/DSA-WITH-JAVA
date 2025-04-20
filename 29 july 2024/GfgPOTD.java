import java.util.ArrayList;
import java.util.Arrays;

/**
 * GfgPOTD
 */
public class GfgPOTD {
    public static String firstWord(int n, String[] dictionary) {

        String ans = "";

        ArrayList<String> dict = new ArrayList<>();
        dict.add(dictionary[0]);

        for (int i = 1; i < dictionary.length; i++) {
            if (dict.contains(dictionary[i])) {
                return "Invalid";
            } else {
                dict.add(dictionary[i]);
            }
        }

        Arrays.sort(dictionary);
        return dictionary[0];
    }

    public static void main(String[] args) {

        String[] arr = { "epabggcva", "aq" };

        System.out.println(firstWord(2, arr));

    }
}