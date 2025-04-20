public class Strings {

    // Prints String without a - Iteration
    public static void removeA(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a') {
                System.out.print(str.charAt(i));
            }
        }
    }

    // Returns a String without a - Iteration
    public static String removea(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a') {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    // Returns a String without a - Recursion
    public static String reMoveA(String str, String emp) {
        if (str.isEmpty()) {
            return emp;
        }

        char ch = str.charAt(0);
        if (ch == 'a') {
            return reMoveA(str.substring(1), emp);
        } else {
            return reMoveA(str.substring(1), emp + ch);
        }

    }

    public static String reMoveA(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);
        if (ch == 'a') {
            return reMoveA(str.substring(1));
        } else {
            return ch + reMoveA(str.substring(1));
        }

    }

    public static String skipApple(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("apple")) {
            return skipApple(str.substring(5));
        } else {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }

    public static String skipAppWhenNotApple(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppWhenNotApple(str.substring(3));
        } else {
            return str.charAt(0) + skipAppWhenNotApple(str.substring(1));
        }

    }

    public static void subsets(String str, String emp){
        if(str.isEmpty()){
            System.out.println(emp);
            return;
        }
        char ch = str.charAt(0);
        subsets(str.substring(1), emp + ch);
        subsets(str.substring(1), emp);
    }
}
