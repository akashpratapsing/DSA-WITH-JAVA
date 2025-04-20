public class RecursionStringAndSubset {

    // Itration
    static String removeAlphabet(String str, char ch) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    // Recursion
    static String removeAlphabetRecursion(String str, char ch, int i) {
        if (i == str.length()) {
            return "";
        }

        String ans = "";
        if (str.charAt(i) != ch) {
            ans = str.charAt(i) + "";
        }

        return ans + removeAlphabetRecursion(str, ch, i + 1);

    }

    static String skipCharacter(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            return skipCharacter(up.substring(1));
        } else {
            return ch + skipCharacter(up.substring(1));
        }
    }

    static void skipCharacter(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            skipCharacter(p, up.substring(1));
        } else {
            skipCharacter(p + ch, up.substring(1));
        }
    }

    static String skipApple(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("apple")) {
            return skipApple(str.substring(5));
        } else {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }

    static String skipAppNotApple(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppNotApple(str.substring(3));
        } else {
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }

    public static void main(String[] args) {

        String str = "abaaazaanac";

        // System.out.println(removeAlphabet(str, 'a'));
        // System.out.println(removeAlphabetRecursion(str, 'a', 0));
        // System.out.println(skipCharacter(str));
        // skipCharacter("", str);
        // System.out.println(skipApple("appleIsapple"));
        System.out.println(skipAppNotApple("appleapplr"));

    }
}
