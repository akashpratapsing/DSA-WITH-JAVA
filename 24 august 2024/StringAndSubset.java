import java.util.ArrayList;

public class StringAndSubset {

    static void printSubStrings(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }

    }

    // Using recursion
    static void printSubStrings(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        printSubStrings(p + up.charAt(0), up.substring(1));
        printSubStrings(p, up.substring(1));

    }

    static void printSubStrings(String p, String up, ArrayList<String> list) {

        if (up.isEmpty()) {
            list.add(p);
            // System.out.println(p);
            return;
        }

        printSubStrings(p + up.charAt(0), up.substring(1), list);
        printSubStrings(p, up.substring(1), list);

    }

    public static void main(String[] args) {

        // printSubStrings("","ABC");
        ArrayList<String> list = new ArrayList<>();
        printSubStrings("", "ABC", list);
        System.out.println(list);
    }
}