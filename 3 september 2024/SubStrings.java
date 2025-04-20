public class SubStrings {

    static void printAllSubs(String str, String curr, int i){

        if (i == str.length()) {
            System.out.println(curr);
            return;
        }

        printAllSubs(str, curr, i + 1);
        printAllSubs(str, curr + str.charAt(i), i + 1);
    }
    public static void main(String[] args) {
        String str = "abc";

        printAllSubs(str, "", 0);
    }
}
