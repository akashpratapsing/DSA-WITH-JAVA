import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * GFGPODT
 */
public class GFGPODT {

    // Big oh of N^2
    static String removeDups(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int j;
            for (j = 0; j < i; j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    break;
                }
            }
            if (i == j) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    // Using LinkedHashSet
    static String removeDuplicate(String str) {

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        StringBuilder sb = new StringBuilder();

        for (Character character : str.toCharArray()) {

            set.add(character);
        }

        for (Character character : set) {
            sb.append(character);
        }

        return sb.toString();
    }

    // Using Hashing
    static String removeDuplicateString(String str) {

        Map<Integer, Character> hash = new HashMap<>();

        String res = "";
        for (Character ch : str.toCharArray()) {
            if (!(hash.containsValue(ch))) {
                hash.put((int) ch, ch);
                res += ch;
            }
        }
        return res;
    }

    static String removeDup(String str) {
        // code here
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (sb.indexOf(ch + "") != -1) {
                continue;
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "abcab";

        // System.out.println(removeDups(str));
        // System.out.println(removeDuplicate(str));
        // System.out.println(removeDuplicateString(str));
        System.out.println(removeDup(str));

    }
}